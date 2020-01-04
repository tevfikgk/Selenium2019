package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FramesDemoEx extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Iframe")).click();
		driver.switchTo().frame(1);
		String arg= driver.findElement(By.linkText("Home")).getText();
		System.out.println(arg);
		
		
		
		
		
		
		
		
		
		
		
	}
}
