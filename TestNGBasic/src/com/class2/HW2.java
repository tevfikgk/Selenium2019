package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utils.CommonMethods;
import com.utils.Constants;

//Open chrome browser 
//2. Go to “http://166.62.36.207/humanresources/symfony/web/index.php/ auth/login” 
//3. Login into the application 
//4. click on Add Employee 
//5. Verify labels: Full Name, Employee Id, Photograph are displayed 
//6. Provide Employee First and Last Name 
//7. Add a picture to the proﬁle 
//8. Verify Employee has been added successfully 
//9. Close the browser

public class HW2 extends CommonMethods{

	@BeforeMethod
	public void navigate(){
	setUp("chrome", Constants.HRMS_URL);
	driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
	
	}
	
	@Test
	public void login() throws InterruptedException {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
	driver.findElement(By.className("button")).click();	
	
	//Click on Add Employee 
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	Thread.sleep(3000);
	
	// Verify labels: Full Name, Employee Id, Photograph are displayed 
	SoftAssert softAssert=new SoftAssert();
	
	boolean fullNameDisplayed= driver.findElement(By.xpath("//label[@class='hasTopFieldHelp']")).isDisplayed();
	softAssert.assertTrue(fullNameDisplayed, "Full name is NOT DISPLAYED");
	
	boolean employeeIdDisplayed= driver.findElement(By.xpath("//label[@for='employeeId']")).isDisplayed();
	softAssert.assertTrue(employeeIdDisplayed, "Employee ID is NOT DISPLAYED");
	
	boolean photographDisplayed= driver.findElement(By.xpath("//label[@for='photofile']")).isDisplayed();
	softAssert.assertTrue(photographDisplayed, "Photograph is NOT DISPLAYED");

	//Provide Employee First and Last Name
	driver.findElement(By.id("firstName")).sendKeys("Tarik");
	driver.findElement(By.id("lastName")).sendKeys("Tuna");
	driver.findElement(By.xpath("//input[@name='employeeId']")).sendKeys("12345");
	
	//Add a picture to the proﬁle 
	driver.findElement(By.id("photofile")).sendKeys("C://Users//tevfi//Desktop//Eligibility.pdf");
	Thread.sleep(3000);
	driver.findElement(By.id("file-submit")).click();

	softAssert.assertTrue(photographDisplayed, "Photograph is NOT DISPLAYED");
	// Save
	driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}
	@AfterMethod
	public void quit(){
	driver.quit();
	}
	
}
