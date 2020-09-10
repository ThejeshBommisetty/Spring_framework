package com.spring.basics.springin10steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.springin10steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn10StepsBasicApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearchImpl= new BinarySearchImpl(new QuickSortAlgorithm());

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn10StepsBasicApplication.class)){
				//SpringApplication.run(SpringIn10StepsBasicApplication.class, args);
			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearchImpl);
			System.out.println(binarySearchImpl1);
			int result = binarySearchImpl.binarySearch(new int[]{12,23,34,6},6);
			System.out.println(result);
		}
	}

}
