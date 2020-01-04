package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MultiWindowsDemo extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", "https://accounts.google.com/signup");
		driver.findElement(By.linkText("Help")).click();
		
		
	}
}
