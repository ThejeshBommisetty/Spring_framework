package com.spring.basics.springin10steps.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@Mock
	SomeCdiDao daoMock;

	@InjectMocks
	SomeCdiBusiness business;

	@Test
	public void testBasicScenario_1() {
		when(daoMock.getData()).thenReturn(new int[] {1, 2, 5});
		assertEquals(5, business.findGreatest());
	}
	
	@Test
	public void testBasicScenario_noElements() {
		when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}
	
	@Test
	public void testBasicScenario_equalsElements() {
		when(daoMock.getData()).thenReturn(new int[] {2,2,2});
		assertEquals(2, business.findGreatest());
	}

}
