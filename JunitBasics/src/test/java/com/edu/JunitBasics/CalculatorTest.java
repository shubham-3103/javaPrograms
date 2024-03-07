package com.edu.JunitBasics;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Assert.assertEquals(4,new Calculator().add(2, 2)); 
	}
	@Test
	public void subTest() {
		Assert.assertEquals(1,new Calculator().sub(3, 2)); 
	}
	
}
