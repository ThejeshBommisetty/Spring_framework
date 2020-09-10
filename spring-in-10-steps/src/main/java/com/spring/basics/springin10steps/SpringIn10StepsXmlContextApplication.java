package com.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn10StepsXmlContextApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringIn10StepsXmlContextApplication.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			//XmlPersonDAO xmlPersonDao = applicationContext.getBean(XmlPersonDAO.class);
			//logger.info("{} {}", xmlPersonDao, xmlPersonDao.getXmlJdbcConnection());
			logger.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
		}
	}

}
