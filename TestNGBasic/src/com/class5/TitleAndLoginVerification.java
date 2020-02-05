package com.class5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.Constants;



public class TitleAndLoginVerification extends CommonMethods{

	@BeforeMethod(alwaysRun=true)
	public void openandNavigate() {
		setUp("chrome", Constants.HRMS_URL);
	}
	
	@Test(priority=1, groups="smoke")
	public void titleVerification() {
		String expectedTitle="Human Management System";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "title is NOT match");
	}
	
	@Test(priority=2, dependsOnMethods= {"titleVerification"}, enabled=true, groups="regression")
	public void loginVerification () throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("menu_pim_viewPimModule")));
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen= ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/myframe1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.findElement(By.id("firstName")).sendKeys("Mustafa");
//		driver.findElement(By.id("lastName")).sendKeys("Kemal");
//		driver.findElement(By.id("chkLogin")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("user_name")).sendKeys("Ataturk");
//		driver.findElement(By.id("user_password")).sendKeys("ataTURK.1357!");
//		Thread.sleep(1000);
//		driver.findElement(By.id("re_password")).sendKeys("ataTURK.1357!");
//		driver.findElement(By.id("btnSave")).click();
//		Thread.sleep(5000);
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}
}
