package com.spring.basics.springin10steps.cdi;

import javax.inject.Named;

//@Component
@Named
public class SomeCdiDao {
	
	public int[] getData() {
		return new int[] {1,2,3};
	}

}
