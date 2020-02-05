package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ActionClass2 extends CommonMethods{
/*
 * Navigate to HRMS application
 * enter uid pwd
 * click on login
 */
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	setUp("chrome", Constants.HRMS_URL);
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
	
	//to perform mouse or keyboard operation we need to have an object on the Action
	Actions act=new Actions(driver);
	WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
	act.moveToElement(loginBtn).contextClick().perform();
	
	act.moveToElement(loginBtn).click().perform();
	// act.click(loginBtn).perform(); //second way
	
	act.moveToElement(loginBtn).doubleClick().perform();
	
	//hover over element
	WebElement hoOv = driver.findElement(By.cssSelector("//a[@id='menu_leave_viewLeaveModule']"));
	act.moveToElement(hoOv).perform();
	Thread.sleep(5000);
	
	//drag and draw
	}
}
