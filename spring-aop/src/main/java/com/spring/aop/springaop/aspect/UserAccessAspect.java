package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration	
@Aspect //AOP
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("com.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {	//JoinPoint is used to know from where we are intercepting calls
		//logger.info("Before interception ");
		logger.info("User Access is checked");
		logger.info("Allowed the execution for -> {} ", joinPoint);
	}
}
