package com.interact.trade.interactrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interact.trade.interactrade.dao.DataDao;

@org.springframework.stereotype.Repository
public interface AlertDataRepository extends JpaRepository<DataDao, Long>{
	
}
