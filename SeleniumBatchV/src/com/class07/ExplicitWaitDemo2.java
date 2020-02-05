package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class ExplicitWaitDemo2 extends CommonMethods{

	/*
	 * navigate to google
	 /* search for wegmans
	  * click on link wegmans grocery delivery |
	  */
	  
	
	public static void main(String[] args) {
		setUp("chrome", "https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Wegmans", Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Wegmans Food Markets - Fresh Groceries & Delicious Meals']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in")));
		driver.findElement(By.id("sign-in")).click();
		
		
		
	}

}
