package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class FileUpload extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "http://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C://Users//tevfi//Desktop//Eligibility.pdf");
		driver.findElement(By.id("file-submit")).click();
		WebElement uploaded=driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		if (uploaded.isDisplayed()){
			System.out.println("Pass");
		}else {
			System.out.println("failed");
		}
		
	}
}