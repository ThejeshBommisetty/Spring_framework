package com.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	//combining all the joinPoints
	//@Pointcut("execution(* com.spring.aop.springaop.data.*.*(..)) && execution(* com.spring.aop.springaop.business.*.*(..))")
	@Pointcut("dataLayerExecution() && businessLayerExecution()")
	public void allLayerExecution() {}
	
	//Starting with DAO
	//@Pointcut("bean(dao*)")
	//public void namedBeanStartingWithDao() {}
	
	//contains DAO
	@Pointcut("bean(*dao*)")
	public void namedBeanContainingDao() {}

	//all the beans
	@Pointcut("within(com.spring.aop.springaop.data..*)")
	public void dataLayerWithin() {}
	
	@Pointcut("@annotation(com.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {	}
	
}
