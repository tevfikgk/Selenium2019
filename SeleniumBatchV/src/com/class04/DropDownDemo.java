package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo extends CommonMethods{
	public static final String HRMS_URL=  "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome");	
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Select Dropdown List")).click();
		WebElement weekDropDown=driver.findElement(By.id("select-demo"));
		
		Select select=new  Select(weekDropDown);                  //works if only tag name is "select"
		
		// We can select values from dropdown in 3 ways
		/*1 by index
		 * 2.by visible
		 * 3.by value attribute and you have to pass the value
		 */
		//SELECT BY INDEX
		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByVisibleText("Sunday");
		Thread.sleep(2000);
		select.selectByValue("Friday");
		
		//select.deselectByIndex(4)
		System.out.println("Is this DD Multi Select="+select.isMultiple());
		
		WebElement multiDD=driver.findElement(By.id("multi-select"));
		Select select2=new Select(multiDD);
		select2.selectByIndex(2);
		select2.selectByIndex(3);
		select2.selectByIndex(4);
		
	}

}

