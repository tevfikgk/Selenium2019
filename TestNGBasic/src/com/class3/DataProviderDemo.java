package com.class3;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.Constants;

public class DataProviderDemo extends CommonMethods{

	@BeforeMethod
	public void openBrowser() {
		setUp("chrome", Constants.HRMS_URL);
	}
	
	@Test(dataProvider="getData")
	public void login(String userName, String password) throws InterruptedException {
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.className("button")).click();	
	}
	//to create data provider method we need to creare a method that will be returning Object 2D array
	@DataProvider
	public Object[][] getData(){
		Object[][] data= {
				{"Admin", "Admin123"},
				{"Syntax", "Syntax123!"},
				{"SyntaxUser","Syntax123!"}
		};
		return data;
	}
	@AfterMethod
	public void quit(){
	driver.quit();
	}
}
