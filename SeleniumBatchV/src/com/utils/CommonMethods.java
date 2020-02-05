package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//username=sohilaryan
//password=syntax@12

// ctrl +o --> see all methods with in the class
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
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
			driver=new FirefoxDriver();
			
		}else {
			System.err.println("Browser not supported");
		}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	}
	/**
	 * This method will accept the alert
	 * @throws will throw NoAlertPresentException if alert is not present
	 */
	public static void acceptAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("alert is not present");
		}
	}
	/**
	 * This method will dismiss the alert
	 * @throws will throw NoAlertPresentException if alert is not present
	 */
	public static void dismissAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("alert is not present");
		}
	}
	/**
	 * This method will get a text from the alert
	 * @return will throw NoAlertPresentException if alert is not present
	 */
	public static String getAlertText() {
		String alertText=null;
		try {
			Alert alert=driver.switchTo().alert();
			alertText=alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("alert is not present");
		}
	return alertText;
	}
	
	/**
	 * This method with switch to the frame 
	 * @param nameOrId 
	 */
	
	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		} catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * This method with switch to the frame 
	 * @param element 
	 */
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * This method with switch to the frame 
	 * @param index 
	 */
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");	
		}
	}
	/**
	 * This method click on the element using JSExecutor
	 * @param element
	 */
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);	
	}
	public static void scrollIntoElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void scrollDown(int pixel) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+ pixel +")");
	}	
	public static void scrollUp(int pixel) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, -"+ pixel +")");	
		
	
	}
	
}

