package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.page.DashboardPageElements;
import com.hrms.page.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class DashBoardPageElementsTest extends CommonMethods{
	
	
	@Test
	public void dashBoardTest() {
		LoginPageElements login=new LoginPageElements();
		DashboardPageElements dashboard=new DashboardPageElements();
		
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		String expectedValue= dashboard.assignLeave.getText();
		Assert.assertEquals("Assign "
				+ "Leave", expectedValue, "Not same");
//		boolean isDisplayed= dashboard.assignLeave.isDisplayed();
//		if (isDisplayed) {
//			System.out.println("displayed");
//		} else {
//			System.out.println("NOT displayed");
//		}
//		
	
	}

}
