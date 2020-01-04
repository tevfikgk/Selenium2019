package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.otokar.com/en-us/Pages/default.aspx");
	//driver.manage().window().fullscreen();
	
	driver.findElement(By.xpath("//span[@class='dropdown-toggle']")).click();
	driver.findElement(By.xpath("//span[text()='English']")).click();
	driver.findElement(By.xpath("//span[text()='Français']")).click();
	}

}
