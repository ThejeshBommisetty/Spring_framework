package com.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.databasedemo.entity.Person;
import com.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication  implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User Details for 10001 is -> {}", dao.findById(10001));
		logger.info("Deleting 10002 -> No of users deleted -> {}", dao.deleteById(10002));
		logger.info("Inserting 10004 -> No of users inserted {}", dao.insert(new Person(10004 ,"Tara", "Sky", new Date()))); 
		logger.info("Updating 10003 -> No of users updated {}", dao.update(new Person(10003 ,"Venkat", "Tirumala", new Date()))); 
	}

}
