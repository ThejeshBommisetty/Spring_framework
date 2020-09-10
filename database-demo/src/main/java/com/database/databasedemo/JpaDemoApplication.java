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
import com.database.databasedemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JpaDemoApplication  implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User Details for 10001 is -> {}", repo.findById(10001));
		logger.info("Inserting new user {}", repo.insert(new Person("Tara", "Sky", new Date()))); 
		logger.info("Updating 10003 -> User updated {}", repo.update(new Person(10003 ,"Venkat", "Tirumala", new Date()))); 
		repo.delete(10002);
		logger.info("All users -> {}", repo.findAll());
	}

}
