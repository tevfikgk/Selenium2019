package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");      /*/**** control F be sure 1 of 1*/
		
		driver.findElement(By.partialLinkText(partialLinkText)).sendKeys("sohilaryan");
		
		
		//form[starts-with@action, '/humanresource']
		//h1[text]()='A place where knoeledge becomes a creeer']
		//h1[contains(text(), 'Syntax']
		//input[@type='hidden' and @name='action ID'
		//input[@type='hidden' or @name='action ID'
		//input[@name='actionID']/following::input[1]   // instead of following we can use back
		
		
	}

}
