package com.centrahub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.centrahub.SalesToSC.SalesToSC;

@RestController
public class mainController {
	
	@Autowired
	private SalesToSC SalesToSC;
	
	@RequestMapping(value="/main",method= {RequestMethod.GET,RequestMethod.POST})
	public SalesToSC Createnewgrid(@RequestParam String accessToken, @RequestParam String transId, @RequestParam String ccode, @RequestParam String userId) {
	        return SalesToSC.Createnewgrid(accessToken, transId, ccode, userId);
		
	}
	

}
