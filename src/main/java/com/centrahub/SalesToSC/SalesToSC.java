package com.centrahub.SalesToSC;
import com.google.gson.*;
import com.mashape.unirest.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.centrahub.status.CLBaseStatusDto;
import com.centrahub.CLConstants;
import com.centrahub.SalesOrder.dto.CRMSalesOrder;
import com.centrahub.utils.CLUtils;
import com.centrahub.utils.Log;
import com.centrahub.SalesOrder.dto.Record;
import com.centrahub.SalesOrder.dto.LineItem;

import com.centrahub.SaasContract.dto.SaasContractdto;
//import com.centrahub.SaasContract.dto.LineItem;
//import com.centrahub.SaasContract.dto.Record;



@Service
public class SalesToSC {
	
	
	//@Autowired
	//private CRMSalesOrder CRMSalesOrder;
	
	@Autowired
	private CLUtils clUtils;
	
	public CLBaseStatusDto Createnewgrid(String accessToken, String transId)
	{
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
	        
	        Record SO_records = CRMSalesOrder.getRecords().get(0);
	        Log.info("Got account name from SO: "+SO_records.getAccountName());
	        Log.info("Got account ID from SO"+SO_records.getAccountId());
	        Log.info("Getting Saas Contract Details with Account");
	        SaasContractdto SaasContractdto = getSCinfo(SO_records.getAccountId().toString(), accessToken);
	        Log.info("Got SC: "+gson.toJson(SaasContractdto));
	        Log.info("Looping and posting the data the SO line items: ");
	        
	        for (int i=0;i<SO_records.getLineItems().size();i++)
	        {
	        	LineItem SO_LineItem = SO_records.getLineItems().get(i);
	        	Log.info("Got Line Items for SO"+gson.toJson(SO_records.getLineItems().get(i)));
	        	Log.info("Got Product Name for line time: "+ SO_LineItem.getProductIdName());
	        	Log.info("Getting product gorup from product info");
	        	
	        	//need to write code for product grp
	        	
	        	
	        	Log.info("Got PRoduct category: "+ SO_LineItem.getProductCategoryName());
	        	
	        	for(int j=0;j<SaasContractdto.getRecords().size();j++)
	        	{
	        		Log.info("Getting Records for SC:");
	        		com.centrahub.SaasContract.dto.Record SC_records = SaasContractdto.getRecords().get(j);
	        		Log.info("Got records for SC:"+ gson.toJson(SC_records));
	        		for(int k=0;k<SC_records.getLineItems().size();k++)
	        		{
	        			com.centrahub.SaasContract.dto.LineItem SC_LineItem =SC_records.getLineItems().get(k);
	        			Log.info("Getting Line Items for SC: ");
	        			
	        			
	        			if(SO_LineItem.getProductIdId()!=SC_LineItem.getiProductIdId() && SO_LineItem.getProductCategoryName()==SC_LineItem.getProductCategoryName())
	        			{
	        				Log.info("Posting the data");
	        			}
	        			else {
	        				Log.info("No Match Found");
	        			}
	        			
	        		}
	        		
	        	}
	        }
	        
	        
	        
	        
	        
	        //taking saaas contract with accounts
	        clStatus.setStatus(1);
		return clStatus;
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
