package com.class09;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ScreenShotDemo extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp("chrome", Constants.HRMS_URL);
		//login into HRMS
		String userName="Admin";
		String password="Hum@nhrm123";
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		String welcomeText=driver.findElement(By.id("welcome")).getText();
		
		if(welcomeText.contains(userName)){
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen= ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/AdminLogin.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
