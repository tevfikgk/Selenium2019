package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class JSExecutorDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		
		js.executeScript("arguments[0].style.backgroundColor='Red'", loginBtn);
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", loginBtn);
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,22050)", loginBtn);
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
