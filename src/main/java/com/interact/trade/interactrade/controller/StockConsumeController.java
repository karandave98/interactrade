package com.interact.trade.interactrade.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interact.trade.interactrade.dao.DataDao;
import com.interact.trade.interactrade.service.ServiceImpl;


@RestController
@RequestMapping("/stock-market")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockConsumeController {
	
	@Autowired
	private ServiceImpl serviceImpl;
	
	private Logger log = LoggerFactory.getLogger(StockConsumeController.class);
	
	@PostMapping(value="/consume-data")
	public void consumeSampleData(@RequestBody DataDao queDto){
		
		
		log.info(new java.util.Date().toString());
		serviceImpl.saveData(queDto);
		log.info(queDto.toString());
		
	}
	
	@GetMapping("/get-data")
	public List<DataDao> checkGetData() {
		return serviceImpl.getAllListData();
	}

}
