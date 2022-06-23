package com.centrahub;

import org.springframework.stereotype.Component;

public class CLConstants {
	
		//ACCESSTOKEN
		public static final String CRM_MODULE = "/crmservices/";
		//Sales Order
	   public static final String CRM_GET_SalesOrder = "/crmservices/rest/modules/V1.0/Sales Order/%s";

	    //Saas Contract
	    public static final String CRM_GET_SC = "/crmservices/rest/modules/V1.0/SaaSContract?where=Account__id='%s";
	    
	    public static final String CRM_POST_SC=  "/crmservices/rest/modules/V1.0/SaaSContract/%s?isRetainExistingRows=true";
	    
	    		//(Account__name='%s')";
	    
	    public static final String CRM_GET_Product = "/crmservices/rest/modules/V1.0/Product?where=Name='%s";
		public static final String CRM_API_LOGOUT = "/crmservices/rest/oauth/logout";
		public static final String CRM_API_AUTH = "/crmservices/rest/oauth/authorize?grant_type=password&client_id=%s&client_secret=%s&username=%s&password=%s&companycode=%s";

}
