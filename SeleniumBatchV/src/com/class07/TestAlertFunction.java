package com.class07;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TestAlertFunction extends CommonMethods{

		public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.xpath("//a[text()='Alerts & Modals']")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		driver.switchTo().alert().sendKeys("Tevfik Gk");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
		

		
}
}
