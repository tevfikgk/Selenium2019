package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		String expectedTitle = ("Facebook - Log In or Sign Up");
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		if (expectedTitle.equals(actualTitle)) {
			driver.findElement(By.name("email")).sendKeys("marcokazika@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.name("pass")).sendKeys("ttGG123456");
			Thread.sleep(1000);
			driver.findElement(By.id("u_0_2")).click();   ///*****thid id value can be change be carefull
			
		} else {
			System.out.println("Title not matching");
		}
		driver.findElement(By.linkText("Marco Kazika")).click();
		
		
		
	
	}
}
