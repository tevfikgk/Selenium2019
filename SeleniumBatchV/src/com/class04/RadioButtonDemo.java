package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButtonDemo extends CommonMethods{

	public static final String SYNTAX_PRACTICE_URL=" http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException {

		//Opening browser with url
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']//following::a[3]")).click();
		WebElement maleRadioDriver= driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		maleRadioDriver.click();
		System.out.println(maleRadioDriver.isSelected());
		
		System.out.println("***************************");
		List<WebElement> radioButtons=driver.findElements(By.name("optradio"));
		
		for(int i=0; i<radioButtons.size(); i++) {
			radioButtons.get(i);
			Thread.sleep(1000);
		}
		
				
	
	
	}

}
