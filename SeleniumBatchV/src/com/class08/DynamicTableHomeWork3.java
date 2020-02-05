package com.class08;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.utils.CommonMethods;
//TC 1: Delete Employee
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//Login into the application
//Add Employee
//Verify Employee has been added
//Go to Employee List
//Delete added Employee
//Quit the browser

public class DynamicTableHomeWork3 extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
		
	setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Add Employee")).click();
	
	driver.findElement(By.id("firstName")).sendKeys("Marco");
	driver.findElement(By.id("lastName")).sendKeys("Polo");
	driver.findElement(By.id("employeeId")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	
	driver.findElement(By.linkText("Employee List")).click();
	
	List<WebElement> listEmployee=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
	
	for (WebElement list1 :listEmployee) {
		String str=list1.getText();
		if(str.contains("Marco Polo")) {
			System.out.println("Test1 (Added employee verification) passed");
			break;
		}
	}
	boolean found=false;    //**************************************************************
	while(!found) {
	for (int i=1; i<listEmployee.size(); i++) {
		
		String str=listEmployee.get(i-1).getText();
		if(str.contains("Marco Polo")) {
			found=true;
			driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+ i + "]/td[1]")).click();
			driver.findElement(By.id("btnDelete")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
			Thread.sleep(1000);
			break;
		}
	}
	driver.findElement(By.xpath("//a[text()='Next']")).click();
	}
	
	driver.findElement(By.linkText("Employee List")).click();
	List<WebElement> listEmployee2=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
	Thread.sleep(2000);
	for (WebElement list2 :listEmployee2) {
		String str=list2.getText();
		if(!str.contains("Marco Polo")) {
			System.out.println("Test2 (Deleded employee verification) passed");
			break;
		}else {
			System.out.println("Test2 (Deleded employee verification) failed");
		}
	}
	
}
			
}
	
	
