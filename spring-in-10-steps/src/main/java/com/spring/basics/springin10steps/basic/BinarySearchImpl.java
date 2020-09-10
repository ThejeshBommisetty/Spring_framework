package com.spring.basics.springin10steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	//@Qualifier("quick")			//using with the Qualifier
	private SortAlgorithm bubbleSortAlgorithm;
	//Using a Constructor Injection
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public int binarySearch(int[] numbers, int numberToSearch) {
		
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers); 
		System.out.println(bubbleSortAlgorithm);
		//search Logic
		
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postContruct log");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("Pre Destroy logger");
	}
}
