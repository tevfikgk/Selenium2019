package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).sendKeys("4693369201");
		driver.findElement(By.name("pass")).sendKeys("ttGG123456");
		driver.findElement(By.id("u_0_b")).click();
		//Thread.sleep(15000);
		//driver.findElement(By.className("linkWrap noCount")).click();
	
	}
	
	

}
