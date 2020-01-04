package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorDemo {

	public static void main(String[] args) {
		

			System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login"); 
			
			
			driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("sohl"); 
			//tagName[attribute='value']
			//[atribute='value'] (you can skip tagname
			
			//  tagName#id (input#txtUsername)    # works only if you have an id attribute
			//	#id (even you can skip tagName)
			//  tg.className (input.button)         dot(.) works  only if you have class value. //if class and has space not works. Clean it or replace with "__ ******
			
			//  input[name^='txt']  // (^) means starts with CSS Selector
			//  input[name$='name']  // ($) means ends with CSS Selector
			
			//  input[id*='nL']  // (*) keyword represents contains in CSS Selector
	}

}
