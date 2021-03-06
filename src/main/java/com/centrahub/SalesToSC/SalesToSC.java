package com.centrahub.SalesToSC;
import com.google.gson.*;
import com.mashape.unirest.http.HttpResponse;
import com.mysql.cj.protocol.Resultset;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import java.sql.*;//this is for sql insert
import java.util.Calendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.centrahub.status.CLBaseStatusDto;
import com.centrahub.CLConstants;
import com.centrahub.Product.dto.Productdto;
import com.centrahub.SalesOrder.dto.CRMSalesOrder;
import com.centrahub.utils.CLUtils;
import com.centrahub.utils.Log;
import com.centrahub.SalesOrder.dto.Record;
import com.centrahub.SalesOrder.dto.LineItem;

import com.centrahub.SaasContract.dto.SaasContractdto;
import com.centrahub.SCinsert.SCHinsert;
//import com.centrahub.SaasContract.dto.LineItem;
//import com.centrahub.SaasContract.dto.Record;



@Service
public class SalesToSC {
	
	
	//@Autowired
	//private CRMSalesOrder CRMSalesOrder;
	
	@Autowired
	private CLUtils clUtils;
	
	public CLBaseStatusDto Createnewgrid(String transId) throws UnsupportedEncodingException
	{
		
		String accessToken=clUtils.login();
		CLBaseStatusDto CLBaseStatusDto = new CLBaseStatusDto();
		 Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        CLBaseStatusDto clStatus = new CLBaseStatusDto();
	        clStatus.setStatus(0);
	        clStatus.setMsg("");
	        clStatus.setError_msg("Error in CRM Posting.");
	

	        Log.info("In CreateOrUpdate SC.");
	        Log.info("Getting SO Deatails for " + transId);
	        CRMSalesOrder CRMSalesOrder = getSalesORderdetails(accessToken, transId);
	        Log.info("Got SO Details : " + gson.toJson(CRMSalesOrder));
	      	 try {
	        Record SO_records = CRMSalesOrder.getRecords().get(0);
	        Log.info("Got account name from SO: "+SO_records.getAccountName());
	        Log.info("Got account ID from SO"+SO_records.getAccountId());
	        Log.info("Getting Saas Contract Details with Account");
	        
	        Log.info("Looping and posting the data the SO line items: ");
	        Log.info("Size of Sales order LineItem: "+SO_records.getLineItems().size());
	        int isize,jsize,ksize,countres=0;
	        com.centrahub.SaasContract.dto.Record SC_PostDataJson = new com.centrahub.SaasContract.dto.Record();
	        com.centrahub.SaasContract.dto.LineItem SC_PLineItem = new com.centrahub.SaasContract.dto.LineItem();
        	List<com.centrahub.SaasContract.dto.LineItem> list1 = new ArrayList();
        	double TotalTaxAmount=0.00;
        	double TotalsaleAmount=0.00;
	        double TotalNetAmount=0.00;
	        int LicPer=0;
	        String MasterId="";
	        Resultset rs =null;
	        
        	for (int i=0;i<SO_records.getLineItems().size();i++)
	        {
        		countres=0;
        		SaasContractdto SaasContractdto = getSCinfo(SO_records.getAccountId().toString(), accessToken);
    	        Log.info("Got SC : "+gson.toJson(SaasContractdto));
	        	LineItem SO_LineItem = SO_records.getLineItems().get(i);
	        	isize=i+1;
	        	Log.info("Got "+ isize +" Line Items for SO : "+gson.toJson(SO_records.getLineItems().get(i)));
	        	Log.info("Got "+ isize +" Product Name for line time: "+ SO_LineItem.getProductIdName());
	        	Log.info("Getting product group from product info");
	        	//need to write code for product grp
	        	Productdto Productdto = getProduct(SO_LineItem.getProductIdName(),accessToken);
	        	com.centrahub.Product.dto.Record P_records = Productdto.getRecords().get(0);
	        	Log.info("Got"+ isize +" product group: "+P_records.getProductGroupName());
	        	Log.info("Size of SC records: "+SaasContractdto.getRecords().size());
	        	
	        	for(int j=0;j<SaasContractdto.getRecords().size();j++)
	        	{
	        		if(countres==0 && countres!=2)
	        		{
	        		jsize=j+1;
	        		Log.info("Getting Records for SC: "+ jsize);
	        		com.centrahub.SaasContract.dto.Record SC_records = SaasContractdto.getRecords().get(j);
	        		
	        		Log.info("Got records for SC:"+ gson.toJson(SC_records));
	        		Log.info("Size of SC LineItem: "+SC_records.getLineItems().size());
	        		
	        		for(int k=0;k<SC_records.getLineItems().size();k++)
	        		{
	        			if(countres==0 || countres==3 && countres!=2)
	        			{
	        			ksize=k+1;
	        			Log.info("Getting LineItem for SC: "+ ksize);
	        			com.centrahub.SaasContract.dto.LineItem SC_LineItem =SC_records.getLineItems().get(k);
	        			
	        			Log.info("Getting Line Items for SC: ");
	        			Log.info("Compare SO_lineitem_productid : "+SO_LineItem.getProductIdId());
	        			Log.info("Compare SC_lineitem getproduct id : "+SC_LineItem.getiProductIdId());
	        			Log.info("Product id name : "+SC_LineItem.getiProductIdName());
	        			Log.info("Product id name 1"+SO_LineItem.getProductIdName());
	        			Log.info("Compare product getproduct id : "+P_records.getProductGroupName());
	        			Log.info("Compare SClineitem getproduct id : "+SC_LineItem.getiProductGroupIdName());
	        			
	        			
	        			if(SO_LineItem.getProductIdId().equals(SC_LineItem.getiProductIdId())  && 
	        					P_records.getProductGroupName().equals(SC_LineItem.getiProductGroupIdName()))
	        			{
	        				countres=2;
	        				Log.info("Update countres to 2 as so product name is equals to sc products");
	        				
	        			}
	        			if(countres!=2)
	        			{
	        			//checking prodIt from sales order and saas contract
	        			if(!SO_LineItem.getProductIdId().equals(SC_LineItem.getiProductIdId())  && 
	        					P_records.getProductGroupName().equals(SC_LineItem.getiProductGroupIdName())  &&
	        					!P_records.getProductGroupName().equals("") &&
	        					!SC_LineItem.getiProductGroupIdName().equals(""))
	        			{
	        				countres=3;
	        				Log.info("Checking more as countres is 3 now");
	        				
	        			}
	        			}
	        			else {
	        				Log.info("No Match Found");
	        				if(countres!=2 && countres !=3)
	        				{
	        				countres=0;
	        				}
	        				
	        			}
	        		}
	        			
	        		}//end of k
	        		if(countres==3)
	        		{
	        			countres=1;
	        		}
	        		
	        		if(countres==1 && countres!=2)
	        		{
	        			
	        			//now
	        			Log.info("Posting the SC data");
        				TotalsaleAmount=  toDob(SO_LineItem.getfSaleLicensePrice());
        	        	TotalTaxAmount= toDob(SO_LineItem.getVATAmount())+toDob(SO_LineItem.getServiceTaxAmount())+toDob(SO_LineItem.getCSTAmount());
        				SC_PLineItem.setiProductIdName(SO_LineItem.getProductIdName());
        				SC_PLineItem.setiProductGroupIdName(P_records.getProductGroupName());
        				SC_PLineItem.setProductDescription(SO_LineItem.getProdDescription());
        				SC_PLineItem.setProductCategoryName(SO_LineItem.getProductCategoryName());
        				SC_PLineItem.setLicenseTypeName(SO_LineItem.getLicenseTypeName());
        				SC_PLineItem.setStreamTypeName(SO_LineItem.getStreamTypeName());
        				SC_PLineItem.setBaseUser(SO_LineItem.getBaseUser());
        				SC_PLineItem.setAmountLocal(SO_LineItem.getfBaseUserCost());
        				SC_PLineItem.setAdditionalUser(SO_LineItem.getAdditionalUser());
        				SC_PLineItem.setfAdditionalUserCost(SO_LineItem.getfAUYearValue());
        				SC_PLineItem.setAdditionalLightUser(SO_LineItem.getAdditionalLightUser());
        				LicPer=toInt(P_records.getLightUserDiscPercentage());
        				SC_PLineItem.setiLightUserPercent(String.valueOf(LicPer));
        				SC_PLineItem.setfLightUsersCost(SO_LineItem.getfLUYearValue());
        				SC_PLineItem.setQuantity("1.00");
        				SC_PLineItem.setSaleLicensePrice(SO_LineItem.getfSaleLicensePrice());
        				SC_PLineItem.setTax1(SO_LineItem.getVat());
        				SC_PLineItem.setTax1Amount(SO_LineItem.getVATAmount());
        				SC_PLineItem.setTax2(SO_LineItem.getServiceTax());
        				SC_PLineItem.setTax2Amount(SO_LineItem.getServiceTaxAmount());
        				SC_PLineItem.setTax3(SO_LineItem.getCst());
        				SC_PLineItem.setTax3Amount(SO_LineItem.getCSTAmount());
        				SC_PLineItem.setTaxAmountLocal(String.valueOf(TotalTaxAmount));
        				SC_PLineItem.setNetAmountLocal(SO_LineItem.getNetAmountLocal());
        				SC_PLineItem.setSalePercentage(SO_LineItem.getSale());
        				SC_PLineItem.setTaxPercentage(SO_LineItem.getPTax());
        				SC_PLineItem.setResellerPercentage(SO_LineItem.getPReseller());
        				SC_PLineItem.setTaxCodeName(SO_LineItem.getTaxCodeName());
        				SC_PLineItem.setfAdditionalUserCostSO(SO_LineItem.getDiscountonUserLocal());
        				
        				list1.add(SC_PLineItem);
        				Log.info("Lst1"+gson.toJson(list1));
	        		//com.centrahub.SaasContract.dto.Record SC_PostDataJson = new  ;	
	        		TotalsaleAmount=TotalsaleAmount+toDob(SC_records.getTotalSaleAmount());
	        		TotalTaxAmount=TotalTaxAmount+toDob(SC_records.getTotalTaxAmount());
	        		SC_PostDataJson.setTotalSaleAmount(String.valueOf(TotalsaleAmount));
	        		SC_PostDataJson.setTotalTaxAmount(String.valueOf(TotalTaxAmount));
	        		TotalNetAmount=TotalsaleAmount+TotalTaxAmount;
	        		SC_PostDataJson.setTotalNetAmount(String.valueOf(TotalNetAmount));
	        		SC_PostDataJson.setName(SC_records.getName());
	        		
	        		SC_PostDataJson.setLineItems(list1);
	        		Log.info("Got Final Json SC : "+gson.toJson(SC_PostDataJson));
    				String sFinalJson = gson.toJson(SC_PostDataJson);
    				
    				if(list1.size()>0) {
    					Log.info("Post Data...");
    					String sJson = "{ \"records\":["+sFinalJson+"]}"; 
    					Log.info(sJson);
    					
    					//gettting new acces token
    					
    					
    					 HttpResponse<String> crm_response = null;
    		                Map<String, String> aotg_headers = new HashMap<String, String>();
    		                aotg_headers.put("content-type", "application/json");
    		                aotg_headers.put("access_token", accessToken);
    		                
    		                String CRM_URL = clUtils.getValueFromPropFile("crm.url");
    		                String sURL = CRM_URL+String.format(CLConstants.CRM_POST_SC,SC_records.getMasterId());
    		                
    		                Log.info("response URL : "+sURL);
    		                Log.info("GOT Accesstoken for 24 Hours : "+accessToken);
    		                Log.info("Got Final Json SC : "+ sJson);
    		                crm_response = clUtils.sendPostRequest(sURL, aotg_headers, sJson);
    		                Log.info("Got Response : "+ crm_response);
    		                Log.info("CRM SC HTTPResponse = " + crm_response.getStatus() + " , " + crm_response.getStatusText() + " , " + crm_response.getBody());
    		                clStatus.setStatus(crm_response.getStatus());
    		                clStatus.setMsg(crm_response.getStatusText());
    		                clStatus.setError_msg("");
    		                int logout_result = 0;
    		                logout_result = clUtils.logout(accessToken);
    		                
    		                Log.info("Posted Successfully and Logged Out Status : "+logout_result);
    		                MasterId=SC_records.getMasterId();
    		                list1.clear();
    		                
    		                
    		              Log.info("Working on Inserting SC history  for SC masterId: " + MasterId);
    		               try {
    		            	   // create a mysql database connection
    		            	   String myUrl = clUtils.getValueFromPropFile("spring.datasource.url");
    		            	   String Username = clUtils.getValueFromPropFile("spring.datasource.username");
    		            	   String password = clUtils.getValueFromPropFile("spring.datasource.password");
    		            	   Connection conn = DriverManager.getConnection(myUrl, Username, password);
    		            	   Log.info("Database connected sucessfully : "+conn);
    		            	   // the mysql insert statement
    		            	  
    		            	   
    		            	   Log.info("MasterId : "+MasterId);
    		            	   String query = " insert into nCore_SaaSContract_SaaS_History([iMasterId],[AdditionalExternalUser],[AdditionalLightUser],[AmountLocal],[BaseUser],[LicenseType],[LightUser],[NetAmountLocal],[NetAmountUSD],[Quantity],[ResellerPercentage],[SalePercentage],[StreamType],[Tax1],[Tax1Amount],[Tax2],[Tax2Amount],[Tax3],[Tax3Amount],[TaxAmountLocal],[TaxAmountUSD],[TaxCode],[TaxPercentage],[iProductId],[ProductDescription],[SaleLicensePrice],[StdLicensePriceLocal],[iProductGroupId],[NoofUsers],[fPerUserAmount],[fAdditionalUserCost],[fLightUsersCost],[iLightUserPercent],iCreatedDate,AdditionalUser)"
    		            		        + " values (dbo.fCrm_IntToAPITransId(?,0), ?, ?, ?, ?, dbo.fCrm_IntToAPITransId(?,0), ?, ?, ?, ?, ?, ?, dbo.fCrm_IntToAPITransId(?,0), ?, ?, ?, ?, ?, ?, ?, ?, dbo.fCrm_IntToAPITransId(?,0), ?, dbo.fCrm_IntToAPITransId(?,0), ?, ?, ?, dbo.fCrm_IntToAPITransId(?,0), ?, ?, ?, ?, ?, dbo.fCore_DateTimeToInt(?), ?)";
    		            	   
    		            	// create a sql date object so we can use it in our INSERT statement
    		            	      Calendar calendar = Calendar.getInstance();
    		            	      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
    		            	      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    		            	      LocalDateTime now = LocalDateTime.now();
    		            	      Log.info("DateTime now : "+dtf.format(now));
    		            	   Log.info("date is : "+startDate);
    		            	   // create the mysql insert preparedstatement
    		            	   PreparedStatement preparedStmt = conn.prepareStatement(query);
    		            	      preparedStmt.setString(1, MasterId);//masterid
    		            	      preparedStmt.setInt(2, toInt(SO_LineItem.getAdditionalExternalUser()));//AdditionalExternalUser
    		            	      preparedStmt.setInt(3, toInt(SO_LineItem.getAdditionalLightUser()));//AdditionalLightUser
    		            	      preparedStmt.setInt(4, toInt(SO_LineItem.getAmountLocal()));//AmountLocal
    		            	      preparedStmt.setInt(5, toInt(SO_LineItem.getBaseUser()));//BaseUser
    		            	      preparedStmt.setInt(6, toInt(SO_LineItem.getLicenseTypeId()));//[LicenseType]
    		            	      preparedStmt.setInt(7, toInt(SO_LineItem.getLightUser()));//[LightUser]
    		            	      preparedStmt.setInt(8, toInt(SO_LineItem.getNetAmountLocal()));//[NetAmountLocal]
    		            	      preparedStmt.setInt(9, toInt(SO_LineItem.getNetAmountUSD()));//[NetAmountUSD]
    		            	      preparedStmt.setInt(10,1);//[Quantity]
    		            	      preparedStmt.setInt(11, toInt(SO_LineItem.getPReseller()));//[ResellerPercentage]
    		            	      preparedStmt.setInt(12, toInt(SO_LineItem.getSale()));//[SalePercentage]
    		            	      preparedStmt.setInt(13, toInt(SO_LineItem.getStreamTypeId()));//[StreamType]
    		            	      preparedStmt.setInt(14, toInt(SO_LineItem.getVat()));//[Tax1]
    		            	      preparedStmt.setInt(15, toInt(SO_LineItem.getVATAmount()));//[Tax1Amount]
    		            	      preparedStmt.setInt(16, toInt(SO_LineItem.getServiceTax()));//[Tax2]
    		            	      preparedStmt.setInt(17, toInt(SO_LineItem.getServiceTaxAmount()));//[Tax2Amount]
    		            	      preparedStmt.setInt(18, toInt(SO_LineItem.getCst()));//[Tax3]
    		            	      preparedStmt.setInt(19, toInt(SO_LineItem.getCSTAmount()));//[Tax3Amount]
    		            	      preparedStmt.setDouble(20, TotalTaxAmount);//[TaxAmountLocal]
    		            	      preparedStmt.setInt(21,0);//[TaxAmountUSD]
    		            	      preparedStmt.setInt(22, toInt(SO_LineItem.getTaxCodeId()));//[TaxCode]
    		            	      preparedStmt.setInt(23, toInt(SO_LineItem.getPTax()));//[TaxPercentage]
    		            	      preparedStmt.setInt(24, toInt(SO_LineItem.getProductIdId()));//[iProductId]
    		            	      preparedStmt.setString(25, SO_LineItem.getProdDescription());//[ProductDescription]
    		            	      preparedStmt.setInt(26, toInt(SO_LineItem.getfSaleLicensePrice()));//[SaleLicensePrice]
    		            	      preparedStmt.setInt(27, 0);//[StdLicensePriceLocal]
    		            	      preparedStmt.setInt(28, toInt(P_records.getProductGroupId()));//[iProductGroupId]
    		            	      preparedStmt.setInt(29, toInt(SO_LineItem.getBaseUser()));//[NoofUsers] net to work
    		            	      preparedStmt.setInt(30, 0);//[fPerUserAmount]
    		            	      preparedStmt.setInt(31, toInt(SO_LineItem.getfAUYearValue()));//[fAdditionalUserCost]
    		            	      preparedStmt.setInt(32, toInt(SO_LineItem.getfLUYearValue()));//[fLightUsersCost]
    		            	      preparedStmt.setInt(33, toInt(SO_LineItem.getfAUYearValue()));//[iLightUserPercent]
    		            	      preparedStmt.setString(34, dtf.format(now));//iCreatedDate
    		            	      preparedStmt.setInt(35, toInt(SO_LineItem.getAdditionalUser()));//AdditionalUser
    		            	      Log.info(preparedStmt.toString());
    		            	      Log.info("sql statement: "+preparedStmt);
    		            	      Log.info("SQL Query is : "+ query);
    		            	      
    		            	      // execute the preparedstatement
    		            	      preparedStmt.execute();
    		            	      String executedQuery = preparedStmt.toString();
    		            	      Log.info("Data Posted to dataBase successfully " + executedQuery);
    		            	     
    		            	      conn.close();

    		               } 
    		               catch (Exception e)
    		               {
    		                 System.err.println("Got an exception!");
    		                 System.err.println(e.getMessage());
    		               }
    		                
    		                
    		                
    						}
    					
	        			}
	        		
	        		}
	        	
	        	}//end of j
	        	
	        } //taking saaas contract with account and end of for loop i
        	
        	
	        
	}
	        catch (Exception e) {
	            e.printStackTrace();
	        }    
		return clStatus;
	}
	
	
	public Productdto getProduct(String Name,String accessToken)
	{
		Productdto Productdto= new Productdto();
		Gson gson = new Gson();
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
        
        try {
       	 String sUrl = CRM_URL+String.format(CLConstants.CRM_GET_Product,URLEncoder.encode(Name)+"'");
       	 Log.info(sUrl);
       	 String encodedurl = sUrl;
           Map<String, String> crm_headers = new HashMap<String, String>();
           crm_headers.put("access_token", accessToken);
           crm_headers.put("content-type", "application/json");
           HttpResponse<String> response = clUtils.sendGetRequest(encodedurl, crm_headers);
           if (response.getStatus() == 200) {
        	   Productdto = gson.fromJson(response.getBody(), Productdto.class);
               if (Productdto.getStatus() == 1 && (Productdto.getErrors() == null)) {
                   return Productdto;
               } else {
                   com.centrahub.utils.Log.info("GET: Sales Order Details: Response : " + response.getBody());
               }
           } else {
               com.centrahub.utils.Log.info("GET: Account Details " +
                       "=== " +
                       "STATUS_CODE : " + response.getStatus() + ", " +
                       "STATUS_TEXT : " + response.getStatusText() + ", " +
                       "BODY : " + response.getBody());
           }
       } catch (Exception ex) {
           ex.printStackTrace();
       }
        
		return Productdto;
	}
	
	
	public int toInt(String sData) {
		try {
	        if (!sData.equals("")) {
	            Double dbl_val = 0.00d;
	            Integer int_val = 0;

	            dbl_val = Double.parseDouble(sData);
	            int_val = (int)Math.round(dbl_val);

	            return int_val;
	        }
		}
		catch(NullPointerException exp)
		{
			  return 0;
		}
	      
		 return 0;
		 
	    }
	
	 public Double toDob(String sData) {
		try {
	        if (!sData.equals("")) {
	            Double dbl_val = 0.00d;
	            Integer int_val = 0;

	            dbl_val = Double.parseDouble(sData);
	            //int_val = (int)Math.round(dbl_val);

	            return dbl_val;
	        }
		}
		catch(NullPointerException exp)
		{
			  return 0.00d;
		}
	      
		 return 0.00d;
		 
	    }
	
	
	
	public SaasContractdto getSCinfo(String Acc,String accessToken)
	{
		SaasContractdto SaasContractdto=new SaasContractdto();
		Gson gson = new Gson();
        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
       
       
        try {
        	 String sUrl = CRM_URL+String.format(CLConstants.CRM_GET_SC,URLEncoder.encode(Acc)+"'");
        	 Log.info(sUrl);
        	 String encodedurl = sUrl;
            Map<String, String> crm_headers = new HashMap<String, String>();
            crm_headers.put("access_token", accessToken);
            crm_headers.put("content-type", "application/json");
            HttpResponse<String> response = clUtils.sendGetRequest(encodedurl, crm_headers);
            if (response.getStatus() == 200) {
            	SaasContractdto = gson.fromJson(response.getBody(), SaasContractdto.class);
                if (SaasContractdto.getStatus() == 1 && (SaasContractdto.getErrors() == null)) {
                    return SaasContractdto;
                } else {
                    com.centrahub.utils.Log.info("GET: Sales Order Details: Response : " + response.getBody());
                }
            } else {
                com.centrahub.utils.Log.info("GET: Account Details " +
                        "=== " +
                        "STATUS_CODE : " + response.getStatus() + ", " +
                        "STATUS_TEXT : " + response.getStatusText() + ", " +
                        "BODY : " + response.getBody());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return SaasContractdto;
		
	}
	
	//?isRetainExistingRows=true

	
	public CRMSalesOrder getSalesORderdetails(String accessToken,String transId) {
		CRMSalesOrder CRMSalesOrder = new CRMSalesOrder();
	        Gson gson = new Gson();
	        String CRM_URL = clUtils.getValueFromPropFile("crm.url");
	        String sUrl = CRM_URL + String.format(CLConstants.CRM_GET_SalesOrder, transId);
	        try {
	            Map<String, String> crm_headers = new HashMap<String, String>();
	            crm_headers.put("access_token", accessToken);
	            crm_headers.put("content-type", "application/json");
	            HttpResponse<String> response = clUtils.sendGetRequest(sUrl, crm_headers);
	            if (response.getStatus() == 200) {
	            	CRMSalesOrder = gson.fromJson(response.getBody(), CRMSalesOrder.class);
	                if (CRMSalesOrder.getStatus() == 1 && (CRMSalesOrder.getErrors() == null)) {
	                    return CRMSalesOrder;
	                } else {
	                    com.centrahub.utils.Log.info("GET: Sales Order Details: Response : " + response.getBody());
	                }
	            } else {
	                com.centrahub.utils.Log.info("GET: Account Details " +
	                        "=== " +
	                        "STATUS_CODE : " + response.getStatus() + ", " +
	                        "STATUS_TEXT : " + response.getStatusText() + ", " +
	                        "BODY : " + response.getBody());
	            }
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        return CRMSalesOrder;
		
		
		
	}
}
