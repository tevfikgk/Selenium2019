package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Liquidation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.liquidation.com/index");
		String title=driver.getTitle();
		System.out.println(title);
		//driver.findElement(By.xpath("//a[@data-target='#']")).click();
		driver.findElement(By.linkText("Buy")).click();
		
		//driver.close();
		Thread.sleep(1000);
		
		driver.get("https://costco.bstock.com/all-inventory");
		//driver.findElement(By.name("loginId")).sendKeys("tevfikgk");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.navigate().back();
		driver.navigate().forward();
		
	
	}
}
