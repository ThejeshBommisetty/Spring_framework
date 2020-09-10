package com.spring.basics.springin10steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

//@Component
@Named
public class SomeCdiBusiness {
	
	//@Autowired
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
	public int findGreatest() {
		int[] data = someCdiDao.getData();
		int greatest=Integer.MIN_VALUE;
		for(int val:data)
			if(val>greatest)
				greatest=val;
		return greatest;
	}

}
