package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Liquidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.liquidation.com/index");
		//driver.findElement(By.xpath("//a[@data-target='#']")).click();
		driver.findElement(By.linkText("Buy"));
		
	}
}
