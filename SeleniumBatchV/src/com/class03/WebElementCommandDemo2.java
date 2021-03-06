package com.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandDemo2 {
	public static final String URL= "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		List <WebElement> links=driver.findElements(By.tagName("a")); //findElements returns group of WebElement. Return list
		//if there is no element findelement return execption. Findelements returns empty list
		System.out.println(links.size());

		for (WebElement link:links) {
			String allLinks=link.getText();
			if(!allLinks.isEmpty()) {
			System.out.println(allLinks);
			}
		}
	}

}
