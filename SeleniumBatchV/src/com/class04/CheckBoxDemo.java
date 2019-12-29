package com.class04;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class CheckBoxDemo extends CommonMethods {
	
	
	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", Constants.HRMS_URL);
		
		driver.manage().window().maximize();
		
		WebElement loginBtn= driver.findElement(By.cssSelector("input#btnLogin"));
		System.out.println(loginBtn.isEnabled());
		
		
}
}
