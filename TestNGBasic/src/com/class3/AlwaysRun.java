package com.class3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlwaysRun {
	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest(alwaysRun=true)
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test() {
		System.out.println("I am an actual test");
}

	@Test
	public void test1() {
		System.out.println("I am an actual test2");
}	

}
