package com.interact.trade.interactrade.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "T_ALERT_DATA")
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DataDao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	private String open;
	
	private String high;
	private String low;
	private String close;
	private String exchange;
	private String ticker;
	private String volume;
	private String time;
	private String timenow;
	private String type;
	
	

}
