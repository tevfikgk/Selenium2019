package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FramesDemo extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		
		String mainText=driver.findElement(By.xpath("//h2[text()='IFrame practice']")).getText();
		
		//main window text
		System.out.println("This tax is from main window: "+mainText);
		
		driver.switchTo().frame("FrameOne");
		// before getting text you have to go inside of the frame
		String insideFrameText= driver.findElement(By.xpath("//h4[text()='Practice Selenium Automation Testing Online']")).getText();
		System.out.println("This tax is from inside frame one: "+insideFrameText);
		
		//This method will take the focuse of your webdriver back to main window
		driver.switchTo().defaultContent();
		
		boolean texDis=driver.findElement(By.xpath("//h2[text()='IFrame practice']")).isDisplayed();
		System.out.println(texDis);
		//driver.close();
		
		//if you want to switch from one frame to second frame, you shhave to switch to default contend firstly.
		//but if you have another frame in one frame like child framne you can switch it directly. 
		//If you want to come back to default contend you have to go firstly parent frame and then defauld contend
		
		
		
		
	}
}
