package com.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.spring.basics.componentscan")
public class SpringIn10StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsComponentScanApplication.class);

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn10StepsComponentScanApplication.class)){
			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
			LOGGER.info("{}",componentDAO);
		}
	}

}
