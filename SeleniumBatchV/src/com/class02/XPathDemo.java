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
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sohil");
		
		
		//form[starts-with@name,'Submit']   //*ends-with also works but value can be changes like facebook quickly
		//form[contain(@name,'Submit')]
		//using text of the web element /*******************
		//h1[text()='A'] place where knowledge becomes a creeer']  //if no any attribute 
		// or //*[text()='username''
		//h1[contains(text(),'Syntax')]
		
		
		//input[@type='hidden' and @name='action ID']                   /******    it can starts with "//*" means it doesnt matter which tag
		//input[@type='hidden' or @name='action ID']
		//input[@name='actionID']/following::input[1]   // we can use back (from child to parent element) as well 
		//input[@name='actionID']/following-parent::li
		//input[@name='actionID']/following-sibling::li[1]
		//Absolute xpath:                //last resort because if any line deleted by the programmer it can not work anymore
		//html/body/div/div/a[2]
	}

}
