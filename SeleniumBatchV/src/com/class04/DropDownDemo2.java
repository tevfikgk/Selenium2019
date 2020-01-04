package com.class04;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownDemo2 extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		
		WebElement weekDropDown=driver.findElement(By.id("select-demo"));
		
		Select select=new  Select(weekDropDown);                  //works if only tag name is "select" *****************
		
		
		
		//Returns list of all options present in dropdown
		List <WebElement> option=select.getOptions(); 
		System.out.println("Size of the DropDown is "+option.size());
		System.out.println(option.get(3));
		
		for (WebElement element:option) {
			//element.getAttribute("value");
			String ddValue=element.getText();
			//System.out.println(ddValue);
			if (ddValue.equals("Friday")) {
				element.click();			}
		}
}
}
