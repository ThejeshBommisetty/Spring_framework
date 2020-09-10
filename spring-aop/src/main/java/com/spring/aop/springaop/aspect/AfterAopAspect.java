package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration	
@Aspect 
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(value="com.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()", returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {} ", joinPoint, result);
	}
	
	/*@AfterThrowing(value="com.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()", throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		logger.info("{} throws an exception {} ", joinPoint, exception);
	}*/
	
	@After(value="com.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution of {} ", joinPoint);
	}
}
