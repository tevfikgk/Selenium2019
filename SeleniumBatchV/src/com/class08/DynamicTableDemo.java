package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

//TC 1: Table headers and rows verification
//
//Open chrome browser
//Go to �http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx�
//Login to the application
//Verify customer �Susan McLaren� is present in the table
//Click on customer details
//Update customers last name and credit card info
//Verify updated customers name and credit card number is displayed in table
//Close browser



public class DynamicTableDemo extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
		
	
	setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
	
	//login
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//search for bob Feather
	
	List <WebElement> rows= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	for (int i=1; i<rows.size(); i++) {
		String rowText=rows.get(i-1).getText();
		//System.out.println(rowText);
		if(rowText.contains("Susan McLaren")) {
		driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+ i +"]/td[13]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_fmwOrder_txtName")));
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Susan Cate");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).clear();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("0012567890");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		
		break;	
		}
	}
	
	List<WebElement> rows2=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	for(int i=1; i<rows2.size(); i++) {
		String rowText=rows2.get(i-1).getText();
		//System.out.println(rowText);
		if(rowText.contains("Susan Cate") && rowText.contains("0012567890")) {
			System.out.println("pass");
			break;
		}
	}
	driver.quit();
}
			
	
}
	
	
