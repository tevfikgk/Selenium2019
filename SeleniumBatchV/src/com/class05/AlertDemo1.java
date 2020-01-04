package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertDemo1 extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();                 
		
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert(); //alert is an  interface
		Thread.sleep(2000);
		//get the text from alert box. Before you hand the alert (before "alert.accept")
		System.out.println("Alert Text: "+alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		
		
		
		//get the text from url or main window
	}

}
