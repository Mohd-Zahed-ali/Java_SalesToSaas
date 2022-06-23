package com.centrahub.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.centrahub.SalesToSC.SalesToSC;
import com.centrahub.status.CLBaseStatusDto;
import com.centrahub.utils.Log;

import com.mashape.unirest.http.HttpMethod;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/CRM")
public class MainController {
	
	
	@Autowired
	private SalesToSC SalesToSC;
	
	@RequestMapping("/tree")
	public int test() {
		Log.info("testing");
		return 1;
	}


	@RequestMapping(value="/Test", method= {RequestMethod.GET,RequestMethod.POST})
	public CLBaseStatusDto Createnewgrid(@RequestParam String transId) throws UnsupportedEncodingException {
			return SalesToSC.Createnewgrid(transId);	
	}
	

}
