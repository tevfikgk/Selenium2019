package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TitleLogoAndLoginVerification extends CommonMethods{

	
		@BeforeMethod
		public void openandNavigate() {
			setUp("chrome", Constants.HRMS_URL);
		}
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}
		
	//Enter valid username and password
	//Click on login button
	//Then verify Syntax Logo is displayed
		
		@Test
		public void loginVerification () {
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
			driver.findElement(By.className("button")).click();
			boolean isDisplayed= driver.findElement(By.xpath("//div[@id='branding']/a/img")).isDisplayed();
			Assert.assertTrue(isDisplayed, "Syntax Logo is displayed");
			
		}
//Other important commands /*************************************************
		
//		@Test(invocationCount=10)
//		public void count() {
//		}
//		
//		@Test(invocationTimeOut=2000)
//		public void infinit() {
//		int i=1;
//		while(i==1) {
//			System.out.println("i");
//		}
//		}
    
//		@Test(expectedExpections="NumberFormatException.class")
//		public void test1() {
//			String a="100A";
//			Integer.parseInt(a);
//		}
//		@Test(priority=2, groups="1",  dependsOnMethods="titleValidation")
		
}