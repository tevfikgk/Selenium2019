package com.class4;

import org.testng.ITestListener;
import org.testng.annotations.Test;

public class ListenersDemo implements ITestListener{

	@Test
	public void test1() {
		System.out.println("I am test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am test 2");
	}
	@Test
	public void test3() {
		System.out.println("I am test 3");
	}
}
