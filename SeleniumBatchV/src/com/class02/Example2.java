package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	driver.findElement(By.xpath("//div[@class='hmenu-item hmenu-title']")).click();
	
	////tag[@attribute='value']  
	}

}
