package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;
import com.utils.Constants;

public class CalendarDemoTest extends CommonMethods{
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//	Login into the application
//	Select Leave List
//	Select from December 1, 2019 until January 31, 2020
//	Check only Pending approval
//	Click on Search
//	Validate “No Records Found” is displayed
//	Quit the browser
	public static void main(String[] args) throws InterruptedException  {
		
		setUp("chrome", Constants.HRMS_URL);
		//login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
		driver.findElement(By.linkText("Leave List")).click();
		Thread.sleep(2000);
		
		//click calendar from button
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(2000);
		//click month button
		WebElement monthDropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectMonth=new  Select(monthDropDown);  
		selectMonth.selectByVisibleText("Dec");
		//click year button
		WebElement yearDropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear=new  Select(yearDropDown);  
		selectYear.selectByVisibleText("2019");
		//click day button
		List <WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement cell:cells){
			if(cell.getText().equals("1")) {
				cell.click();
			break;
			}
		}
		
		Thread.sleep(2000);
		//click calendar to button
				driver.findElement(By.xpath("//input[@id='calToDate']")).click();
		//click month button
		Thread.sleep(2000);
		WebElement monthDropDownTo=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectMonthTo=new  Select(monthDropDownTo);  
		selectMonthTo.selectByVisibleText("Jan");
		Thread.sleep(2000);
		//click year button
		WebElement yearDropDownTo=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYearTo=new  Select(yearDropDownTo);  
		selectYearTo.selectByVisibleText("2020");
		Thread.sleep(2000);
		//click day button
		List <WebElement> cells2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement cell:cells2){
			if(cell.getText().equals("31")) {
				cell.click();
			break;
			}
		}
		Thread.sleep(2000);
		//Check only Pending approval
		boolean isSelected= driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_1']")).isSelected();
		if(isSelected) {
			System.out.println("Only Pending approval selected");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			String expectedText= driver.findElement(By.xpath("//td[@colspan='8']")).getText();
			if(expectedText.equals("No Records Found")) {
				System.out.println("Test Case accomplished. All tests are done");
			}else {
				System.out.println("Test unfail");
			}
		}		
	
	}
}
