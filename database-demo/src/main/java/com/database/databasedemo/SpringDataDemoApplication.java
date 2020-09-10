package com.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.databasedemo.entity.Person;
import com.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication  implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository springRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("User Details for 10001 is -> {}", springRepo.findById(10001));
		logger.info("User inserted {}", springRepo.save(new Person("Tara", "Sky", new Date()))); 
		logger.info("User updated {}", springRepo.save(new Person(10003 ,"Venkat", "Tirumala", new Date())));
		springRepo.deleteById(10002);
		logger.info("All users -> {}", springRepo.findAll());
	}

}
