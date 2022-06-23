package com.centrahub.utils;


import com.centrahub.CLConstants;
import com.centrahub.CLAuthDto.CLAuthDto;
import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class CLUtils implements IUtils {

    @Autowired
    private Environment env;

    public static String TEMP_PATH = System.getenv("TEMP");

    @Override
    public HttpResponse<String> sendGetRequest(String sUrl, Map<String, String> headers) {
        HttpResponse<String> response = null;
        Unirest.setTimeouts(0, 0);
        try {
            response = Unirest
                    .get(sUrl)
                    .headers(headers)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public HttpResponse<String> sendPostRequest(String sUrl, Map<String, String> headers, String sJson) {
        HttpResponse<String> response = null;
        Unirest.setTimeouts(0, 0);
        try {
            response = Unirest
                    .post(sUrl)
                    .headers(headers)
                    .body(sJson)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public HttpResponse<String> sendPutRequest(String sUrl, Map<String, String> headers, String sJson) {
        HttpResponse<String> response = null;
        Unirest.setTimeouts(0, 0);
        try {
            response = Unirest
                    .put(sUrl)
                    .headers(headers)
                    .body(sJson)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public HttpResponse<String> sendDeleteRequest(String sUrl, Map<String, String> headers) {
        HttpResponse<String> response = null;
        Unirest.setTimeouts(0, 0);
        try {
            response = Unirest
                    .delete(sUrl)
                    .headers(headers)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return response;
    }

    public String getValueFromPropFile(String sKey) {
        return env.getProperty(sKey);
    }

    @Override
    public void log(String sDate) {
    }

    public static String isFileExist(String sFilepath, Boolean bDoCreateIfNotExits) throws IOException {

        File fl = new File(sFilepath);
        if (fl.exists()) {
            return sFilepath;
        } else {
            if (bDoCreateIfNotExits) {
                if (fl.createNewFile()) {
                    return sFilepath;
                } else {
                    return null;
                }
            }

        }
        return null;
    }

    public static String getCurrentDateAsString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return sdf.format(date);
    }

    public static String getCurrentDateTimeAsString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        return sdf.format(date);
    }

    public static void writeToFile(String sData, String sFilePath) throws IOException {
        try {
            Files.write(Paths.get(sFilePath), sData.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    	///1
    
    public Integer logout(String accessToken) {
        Log.info("In Logout..");
        Integer iReturn = 0;
        try {
            String sUrl = getValueFromPropFile("crm.url");
            sUrl = sUrl + CLConstants.CRM_API_LOGOUT;
            Map<String, String> crm_headers = new HashMap<String, String>();
            crm_headers.put("Accept", "application/json");
            crm_headers.put("access_token", accessToken);
            Log.info("Logout Url " + sUrl);
            Log.info("Logout AccessToken " + accessToken);
            HttpResponse<String> resp = sendGetRequest(sUrl, crm_headers);
            if (resp.getStatus() == 200) {
                JsonObject jobj = (new com.google.gson.JsonParser()).parse(resp.getBody()).getAsJsonObject();
                if (jobj.get("status").toString().equals("1")) {
                    iReturn = 1;
                    Log.info("Logged out Successfully.");
                    return iReturn;
                } else {
                    Log.info("Error in CRMService while logging out. (" + resp.getBody() + ")");
                    return iReturn;
                }
            } else {
                Log.info("Http Error while logging out CRM. (" + resp.toString() + ")");
                return iReturn;
            }
        } catch (Exception ex) {
            Log.info("Exception while logging out CRM. (" + ex.getMessage() + ")");
            return iReturn;
        }
    }

    public String login(String client_id, String client_secret, String username, String password,String companycode) {
        Log.info("in Login..");
        String sAccessToken = "";
        Gson gson = new Gson();
        CLAuthDto clAuthDto = new CLAuthDto();
        try {
            Log.info("in Login Try block..");
            String sUrl = getValueFromPropFile("crm.url");
            sUrl = sUrl + String.format(CLConstants.CRM_API_AUTH, client_id, client_secret, username, password,companycode);
            Log.info("Login URL Encoded : " + sUrl);
            //sUrl= URLDecoder.decode(sUrl, "UTF-8");
            //Log.info("Login URL Decided: " + sUrl);

            Map<String, String> crm_auth_headers = new HashMap<String, String>();
            crm_auth_headers.put("content-type", "application/json");
            HttpResponse<String> httpResp = sendGetRequest(sUrl, crm_auth_headers);
            if (httpResp.getStatus() == 200) {
                clAuthDto = gson.fromJson(httpResp.getBody(), CLAuthDto.class);
                JsonObject authObj = (new  com.google.gson.JsonParser()).parse(httpResp.getBody()).getAsJsonObject();
                if (clAuthDto.getStatus()==1) {
                    sAccessToken = clAuthDto.getAccessToken();
                    Log.info("Login Successful.\n Access Token : " + sAccessToken);
                    return sAccessToken;
                } else {
                    Log.info("Login error CRM Service. (" + clAuthDto.getErrors().toString() + ")");
                    return "";
                }
            } else {
                Log.info("Http Error while loggin in CRM service. (" + httpResp.toString() + ")");
                return "";
            }
        } catch (Exception ex) {
            Log.info("in Login Catch block..");
            Log.info("Exception in Login : " + ex.getMessage());
            return "";
        }
    }

    public String login() throws UnsupportedEncodingException {
        String sClientId = URLEncoder.encode(getValueFromPropFile("crm.clientid"), StandardCharsets.UTF_8.toString());
        String sClientKey = URLEncoder.encode(getValueFromPropFile("crm.clientkey"), StandardCharsets.UTF_8.toString());
        String sUserName = URLEncoder.encode(getValueFromPropFile("crm.username"), StandardCharsets.UTF_8.toString());
        String sPassword = URLEncoder.encode(getValueFromPropFile("crm.password"), StandardCharsets.UTF_8.toString());
        String sCompanyCode = URLEncoder.encode(getValueFromPropFile("crm.companycode"), StandardCharsets.UTF_8.toString());
        return login(sClientId, sClientKey, sUserName, sPassword,sCompanyCode);
    }
    //end

    	
    }
