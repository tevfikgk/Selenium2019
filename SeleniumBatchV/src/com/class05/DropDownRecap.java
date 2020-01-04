package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		
		WebElement dd=driver.findElement(By.id("select-demo"));
		Select select=new Select(dd);
		select.selectByIndex(3);
		select.selectByVisibleText("Friday");
		select.selectByValue("Wednesday");
		
		List <WebElement> options=select.getOptions();
		System.out.println(options.size());
		
		Iterator<WebElement> itr=options.iterator();
				while(itr.hasNext()) {
					itr.next().click();
				}
				
		//select.isMultiple();
				System.out.println(select.isMultiple());
		
	}

}
