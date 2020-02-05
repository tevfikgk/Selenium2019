package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ActionsClassDemo extends CommonMethods{
/*
 * Navigate to HRMS application
 * enter uid pwd
 * click on login
 * 
 * identify element to drag
 * identify to which element to dropp
 * actions.dragAndDrop(elementToDrag, whereToDrop
 */
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	setUp("chrome", Constants.HRMS_URL);
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
	
//	2
	}
}
