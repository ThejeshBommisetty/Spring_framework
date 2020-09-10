package com.spring.aop.springaop.dao;

import org.springframework.stereotype.Repository;

import com.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveData() {
		return "Dao1";
	}
}
