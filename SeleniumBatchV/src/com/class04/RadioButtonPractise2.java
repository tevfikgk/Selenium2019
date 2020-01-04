package com.class04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButtonPractise2 extends CommonMethods {

		public static final String HRMS_URL=  "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		
		public static void main(String[] args) throws InterruptedException {
			
			CommonMethods.setUp("chrome", HRMS_URL);
			driver.get(HRMS_URL);
			driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
			driver.findElement(By.linkText("Radio Buttons Demo")).click();
			List<WebElement> radioButton= driver.findElements(By.xpath("//input[@name='optradio']"));
			
			System.out.println(radioButton.size());
			
			for (WebElement radioB:radioButton) {
				radioB.click();
				Thread.sleep(1000);
			}
			
			
			//driver.close();
	}

}
