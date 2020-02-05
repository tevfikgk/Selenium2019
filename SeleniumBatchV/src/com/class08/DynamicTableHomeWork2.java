package com.class08;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class DynamicTableHomeWork2 extends CommonMethods{
public static void main(String[] args) {
		
	
	setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders");
	
	//login
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//search for bob Feather
	String expectedValue="Bob Feather";
	List <WebElement> rows= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	for (int i=0; i<rows.size(); i++) {
		String rowText=rows.get(i).getText();
		System.out.println(rowText);
		if(rowText.contains(expectedValue)) {
			driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+(i+1)+"]/td[1]")).click();
		}
	}
}
			
	
}
	
	
