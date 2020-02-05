package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class ExplicitWaitDemo3 extends CommonMethods{

	/*
	 * 
	 */
	
	public static void main(String[] args) {
		setUp("chrome", "https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 1:")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']"))) ;
		boolean visibleText=	driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		if(visibleText) {
		System.out.println("Pass");
			}else {
		System.out.println("Fail");
			}
		driver.quit();
		
		
		
		
		
	}

}
