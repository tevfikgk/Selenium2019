package com.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

		public void onTestStart(ITestResult result) {
			System.out.println("Test Start "+result.getName());
		}
		
		public void onTestSuccess(ITestResult result) {
		   System.out.println("Test passed "+result.getName());
		   CommonMethods.takeScreenshot("passed/"+result.getName());
		  }
		public void onTestFailure(ITestResult result) {
		    System.out.println("Test vailed "+result.getName());
		    CommonMethods.takeScreenshot("failed/"+result.getName());
		  }
}
