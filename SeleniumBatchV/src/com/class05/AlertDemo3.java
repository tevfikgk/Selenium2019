package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertDemo3 extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();                 
		
		//ONLY JAVA SCRIPT ALERT ****************
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		//find the second alert button and click on it
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Thread.sleep(2000);
		
		//handle the alert
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("Weqas");
		
		alert.accept();
		
		driver.close();
		
		
		
		
	}
}
