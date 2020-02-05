package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class PageLoadedImplicitWait extends CommonMethods{

	public static void main(String[] args) {
		
	
	
		setUp("chrome", "https://cnn.com");
	
		//page loads waits until all elements on the page gets fully loaded
		//if element wont load within 30 seconds you will get TimeOutExceptions
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //this works only driver.get and driver.navigate
		
		
		//tell webdriver to wait for the element before throwing NoSuchelementException.
		//it implicitly wait for EVERY ELEMENT 	(**drive.findElement**)IN THE PROGRAM
		//we need implicit wait. works with drive.findElement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("wrongName")).sendKeys("iphone");
		
		driver.quit();
	}	
}
