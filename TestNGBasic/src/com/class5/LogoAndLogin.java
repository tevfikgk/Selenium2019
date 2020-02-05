package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utils.CommonMethods;
import com.utils.Constants;

public class LogoAndLogin extends CommonMethods {

	@BeforeMethod(alwaysRun=true)
	public void openandNavigate() {
		setUp("chrome", Constants.HRMS_URL);
	}
	
	
	
	@Test (priority=1, groups="smoke")
	public void logoVerification() {
	boolean isDisplayed=driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
	SoftAssert softAssert=new SoftAssert();
	softAssert.assertTrue(isDisplayed, "Logo is NOT displayed");
	}
	
	@Test(priority=2, groups="regression")
	public void loginVerification () throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}
}
