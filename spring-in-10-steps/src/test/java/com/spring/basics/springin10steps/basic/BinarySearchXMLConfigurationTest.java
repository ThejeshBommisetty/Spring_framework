package com.spring.basics.springin10steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.basics.springin10steps.SpringIn10StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXMLConfigurationTest {

	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario () {
		int result = binarySearch.binarySearch(new int[] {1},3 );
		assertEquals(3, result);
	}

}
