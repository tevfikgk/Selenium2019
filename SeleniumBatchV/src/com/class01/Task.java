package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*TC 1: Amazon Page Title Verification: 
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
*/

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("I am on the right page");
		} else {
			System.out.println("They dont match");
		System.out.println("*******Task2*********");
		}
		
		/*Navigate to “https://www.syntaxtechs.com/”
		Navigate to “https://www.google.com/”
			Navigate back to Syntax Technologies Page
			Refresh current page
			Verify url contains “Syntax”
	*/
		//driver.navigate().to("http://www.syntaxtechs.com/");
		//driver.navigate().to("http://www.google.com/");
		//driver.navigate().back();
		//driver.close();
		
		
		
	}

}
