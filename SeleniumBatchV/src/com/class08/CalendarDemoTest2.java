package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;
import com.utils.Constants;

public class CalendarDemoTest2 extends CommonMethods{

//	TC 1: Table headers and rows verification
//	Open chrome browser
//	Go to “https://www.aa.com/homePage.do”
//	Enter From and To
//	Select departure as May 14 of 2020
//	Select arrival as November 8 of 2020
//	Verify “Choose flights” text is displayed
//	Take s screenshot of the results
//	Close browser
	
	public static void main(String[] args) throws InterruptedException  {
		
		setUp("chrome", "https://www.aa.com/homePage.do");
		
		
		
		//From
		driver.findElement(By.xpath("//input[@value='DFW']")).clear();
		driver.findElement(By.xpath("//input[@value='DFW']")).sendKeys("Houston");
		
		//To
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).clear();
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("Miami");
		
		
		//Depart
		//Calender
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(2000);
		//Month-year
		for(int i=0; i<12; i++) {
		String month1=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if(!month1.contains("May")){
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();	
		Thread.sleep(2000);
			}else {
				break;
			}
		}
		
		//Day
		List <WebElement> cells = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
		for(WebElement cell:cells){
			if(cell.getText().equals("14")) {
				cell.click();
			break;
			}
		}
		//Return
		
		
		
		
		
		
		//driver.close();
	
		
	}
}
