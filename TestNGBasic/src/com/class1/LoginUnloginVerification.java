package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.Constants;

public class LoginUnloginVerification extends CommonMethods{

	@BeforeMethod
	public void openandNavigate() {
		setUp("chrome", Constants.HRMS_URL);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	@Test
	public void Login() {
		String expectedTitle="Human Management System";
		String actualTitle=driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test failed");
		}
	}
	
	@Test 
	public void logoVerification() {
	boolean isDisplayed=driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		if (isDisplayed) {
		System.out.println("Tess pass");
		}else {
		System.out.println("Tess failed");
		}
	}
	
	@Test
	public void login () {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();
	}
	

}
