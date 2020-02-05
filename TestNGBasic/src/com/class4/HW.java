package com.class4;
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Login into the application
//Add 5 different Employees and create login credentials by providing: 
//First Name
//Last Name
//Username
//Password
//Provide Employee First and Last Name
//Verify Employee has been added successfully and take screenshot (you must have 5 different screenshots)
//Close the browser
//Specify group for this test case, add it into specific suite and execute from xml file.

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.Constants;

public class HW extends CommonMethods {
	
	@BeforeMethod(alwaysRun=true)
	public void navigate(){
	setUp("chrome", Constants.HRMS_URL);
	driver.manage().window().fullscreen();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
	driver.findElement(By.className("button")).click();	
	
	}

//	@Test(dataProvider="employeeName", groups="regression")
	//Login
	public void login(String firstName, String lastName, String userName, String password, String screenshotName) throws InterruptedException {
	
	//Ad data
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("firstName")).sendKeys(firstName);
	driver.findElement(By.id("lastName")).sendKeys(lastName);
	driver.findElement(By.id("chkLogin")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("user_name")).sendKeys(userName);
	driver.findElement(By.id("user_password")).sendKeys(password);
	Thread.sleep(1000);
	driver.findElement(By.id("re_password")).sendKeys(password);
	driver.findElement(By.id("btnSave")).click();
	Thread.sleep(5000);
	
	//Employee adding verification
	 String employeeId=driver.findElement(By.id("employeeId")).getAttribute("value");
     String actualId=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
     Assert.assertEquals(actualId, employeeId, "NOT match");
     
     TakesScreenshot ts=(TakesScreenshot)driver;
     File screen=ts.getScreenshotAs(OutputType.FILE);
     
     try {
         FileUtils.copyFile(screen, new File("screenshots/HMRS/addEmpoyee/"+screenshotName+".png"));
     } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }         
 
   }
	
	@DataProvider
	public Object[][] employeeName(){
		Object[][] data= {
				{"John1", "Bond", "jbond", "KjbonD.165", "john01"},
				{"John2", "kond", "kkond", "LkonD.237","john02" },
				{"John3", "Mond", "mmond", "MmonD.135","john03"},
				{"John4", "Nond", "nnond", "DnonD.126","john04"},
				{"John5", "Pond", "ppond", "SponD.378","john05"},
				
		};
		return data;
	}
	
	
	@AfterMethod
	public void quit(){
	driver.quit();
	}
}
