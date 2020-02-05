package com.class2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utils.CommonMethods;
import com.utils.Constants;
//open app
//verify lego is displayed
//enter valid creditials
//verify user succesfully logged in 
	public class SoftAssertionsDemo extends CommonMethods{

		@BeforeMethod
		public void openandNavigate() {
			setUp("chrome", Constants.HRMS_URL);
		}
		
		@Test
		public void logoandlogin() {
		boolean logoDisplayed = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		logoDisplayed=false;
		
		//	Hard assert will fail and execution will stop at that point	
		//Assert.assertTrue(logoDisplayed, "Logo is not displayed"); //'Logo is not displayed' shown when programfailed
		
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(logoDisplayed, "Logo is NOT displayed");
				
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();	
		
		boolean welcomeDisplayed=driver.findElement(By.id("welcome")).isDisplayed();
		//Assert.assertTrue(welcomeDisplayed);
		softAssert.assertTrue(welcomeDisplayed,"Welcome element is NOT displayed");
		softAssert.assertAll();
		}
		
		@AfterMethod
		public void closeBrowser() {
		driver.quit();
		}
		
		
}
