package com.class04;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class CheckBoxesDemo extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		WebElement ageCheckBox= driver.findElement(By.id("isAgeSelected"));
		Thread.sleep(1000);
		if (!ageCheckBox.isSelected()) {
			ageCheckBox.click();
			Thread.sleep(1000);
		} 
		ageCheckBox.click();
		
		System.out.println("*****************group if check boxes");
		List<WebElement> groupCheckBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		if (!groupCheckBox.isEmpty()) {
			Iterator< WebElement> it= groupCheckBox.iterator();
			while(it.hasNext()){
				it.next().click();
				Thread.sleep(1000);
			}
		}else {
			System.err.println("something wrong");
		}
		
}
}

