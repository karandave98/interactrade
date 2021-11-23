package com.interact.trade.interactrade.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock-market")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockConsumeController {
	
	private Logger log = LoggerFactory.getLogger(StockConsumeController.class);
	
	@PostMapping(value="/consume-data", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void consumeSampleData(@RequestBody Object queDto, HttpServletRequest request){
		log.info(queDto.toString());
		log.info(request.toString());
	}

}
