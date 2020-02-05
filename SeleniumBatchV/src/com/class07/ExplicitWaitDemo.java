package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ExplicitWaitDemo extends CommonMethods  {

	public static void main(String[] args) {
		
		setUp("chrome",Constants.SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Dynamic Data Loading")).click();
		driver.findElement(By.id("save")).click();
		
		//webdriver wait explicit wait--> wait for specific element to appear on the 
		//it will wait until expected condition is met or specified time
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[starts-with(text(),'First')]")));
		
		boolean displayed= driver.findElement(By.xpath("//p[starts-with(text(),'First')]")).isDisplayed();
		
		if (displayed) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
		}
	}

}
