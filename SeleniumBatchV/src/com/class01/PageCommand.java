package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommand {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("I am on the right page");
		} else {
			System.out.println("They dont match");
		}
		driver.close();
		
		/////////*******************
		
		String expectedUrl="https://www.google.com/?gws_rd=ssl";
		String actualUrl=driver.getCurrentUrl();
		if (expectedUrl.equals(actualUrl)){
			System.out.println("Both URL matched");
		}else {
			
		}
		
		
		
	}

}
