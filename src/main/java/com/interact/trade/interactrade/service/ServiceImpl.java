package com.interact.trade.interactrade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interact.trade.interactrade.dao.DataDao;
import com.interact.trade.interactrade.repository.AlertDataRepository;

import lombok.RequiredArgsConstructor;

@Service

public class ServiceImpl {
	@Autowired
    private AlertDataRepository alertDataRepository;
	
	public void saveData(DataDao dataDao) {
		alertDataRepository.save(dataDao);
		
	}
	
	public List<DataDao> getAllListData() {
		return alertDataRepository.findAll();
	}

}
