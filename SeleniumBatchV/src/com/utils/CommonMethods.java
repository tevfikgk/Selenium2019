package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//username=sohilaryan
//password=syntax@12
public class CommonMethods {
	
	public static WebDriver driver;
	/**
	 * Use this method in need of opening browser and target url
	 * @param browser The desired browser
	 * @param url
	 */
	public static void setUp(String browser,String url) {
	if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
			driver=new ChromeDriver();  
			driver.get(url);
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe" );
			driver=new FirefoxDriver();
			driver.get(url);
		}else {
			System.err.println("Browser not supported");
		}
	}
}

