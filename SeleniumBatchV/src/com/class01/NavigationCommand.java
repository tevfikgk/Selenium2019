package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.walmart.com");
		driver.navigate().to("http://google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		//driver.get("http://www.google.com");  /hypertext transfer protocol source
		//Thread.sleep(1000);
		//driver.navigate().to("http://www.facebook.com");
		/*driver.navigate().back();
		driver.navigate().forward();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		driver.close();*/
	}

}
