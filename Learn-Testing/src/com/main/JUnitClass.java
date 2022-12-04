package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnitClass {
	
	String username="Nishant123";
	
	@Test
	public void testUserName() {
		System.out.println("Testing if username match");
		assertEquals("Nishant123", username);
	}

	@Test
	public void junitMethod() {
		System.out.println("Test file executed..");
	}
	public static void main(String[] args) {
		JUnitClass results=new JUnitClass();
		results.testUserName();
	}

}
