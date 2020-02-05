package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class ExplicitWaitDemo4 extends CommonMethods{

	/*TC 2: Verify element is clickable

Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Select checkbox and click Remove
Click on Add button and verify “It’s back!” text is displayed
Close the browser
 */
	
	public static void main(String[] args) {
		setUp("chrome", "https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		String message= driver.findElement(By.xpath("//p[@id='message']")).getText();
				
			
		if (message.equals("It's back!")){
			System.out.println("Pass");
		}else {
			System.out.println("not pass");
		}
		
		
		
		
		
	}

}
