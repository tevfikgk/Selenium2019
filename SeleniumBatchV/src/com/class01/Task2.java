package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	/*Navigate to “https://www.syntaxtechs.com/”
		Navigate to “https://www.google.com/”
		Navigate back to Syntax Technologies Page
		Refresh current page
		Verify url contains “Syntax”
*/
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver();
	
	driver.get("www");  //hypertext transfer protocol source
	
	driver.navigate().to("http://www.facebook.com");
	driver.navigate().back();
	driver.navigate().forward();
	
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	driver.close();
	}
}
