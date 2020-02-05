package com.class09;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class CalendarDemoScreenShot extends CommonMethods{

	public static void main(String[] args) throws InterruptedException  {
		
		setUp("chrome", Constants.HRMS_URL);
		//login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
		driver.findElement(By.linkText("Leave List")).click();
		
		//step1 click on the calendar
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		//step2 get all cells
		List <WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement cell:cells){
			if(cell.getText().equals("16")) {
				cell.click();
			break;
			}
		}
		Thread.sleep(3000);
		
		TakesScreenshot cln = (TakesScreenshot) driver;
		File calender = cln.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		try {
			FileUtils.copyFile(calender, new File("screenshots/HRMS/Calendar.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(15000);
		driver.close();
	
	}

}
