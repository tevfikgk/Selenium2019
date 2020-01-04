package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsDemo4 {
	
	
		public static final String URL= "https://www.saucedemo.com/";
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get(URL);
			WebElement userName=driver.findElement(By.cssSelector("input[type='text']"));
			userName.sendKeys("standard_user");
			
			WebElement password= driver.findElement(By.cssSelector("input[type='password']"));
			password.sendKeys("secret_sauce");
			Thread.sleep(1000);
			
			
			
			WebElement robotColumn= driver.findElement(By.cssSelector("div[class='bot_column']"));
			if (robotColumn.isDisplayed()) {
				System.out.println("Robot column is successfully displayed");
			} else{
				System.out.println("Unfortunately Robot column is not displayed");
			}
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			
			WebElement product=driver.findElement(By.xpath("//div[@class='product_label']"));
			String realName= product.getText();
			String expectedName="Products";
			if(realName.equals(expectedName)) {
				System.out.println("Name is true");
			} else {
				System.out.println("Name is not true");
			}
			
			driver.close();
}
		
}
