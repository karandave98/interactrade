package com.interact.trade.interactrade.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
@RequestMapping("/stock-market")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockConsumeController {
	
	private Logger log = LoggerFactory.getLogger(StockConsumeController.class);
	
	@PostMapping(value="/consume-data")
	public void consumeSampleData(@RequestBody Object queDto, HttpServletRequest request){
		log.info(new java.util.Date().toString());
		log.info(queDto.toString());
		log.info(request.toString());
	}
	
	@GetMapping("/get-data")
	public HashMap<String, String> checkGetData() {
		HashMap<String, String> c = new HashMap();
		c.put("test", "123456789");
		log.info(new java.util.Date().toString());
		return c;
	}

}
