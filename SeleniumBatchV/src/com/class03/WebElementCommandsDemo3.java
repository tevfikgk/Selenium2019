package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsDemo3 {
	
	
		public static final String URL= "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get(URL);
			
			//get attribute hidden value
			WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
			userName.sendKeys("Admin");
			System.out.println(userName.getAttribute("value"));
			

			//get attribute will give us the attribute we provide
			String attribute=driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("id");
			System.out.println(attribute);
			
			//click & submit
			driver.findElement(By.xpath("//input[@type='submit']")).submit(); //if you want a submit form. it waits for loads
}
		
}
