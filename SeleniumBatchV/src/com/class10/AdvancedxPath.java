package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;
import com.utils.Constants;

public class AdvancedxPath extends CommonMethods{
//	TC 1: HRMS Login
//
//	Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//	Login to the application by writing xpath based on “parent and child relation”
//
//	TC 2: HRMS Login
//
//	Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//	Login to the application by writing xpath based on “following and preceding siblings”
//
//
//	Collapse

	public static void main(String[] args) {

//		setUp("chrome", Constants.HRMS_URL);
//		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
//		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
//		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
//		driver.quit();
		
		setUp("chrome", "http://166.62.36.207/syntaxpractice/index.html");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).click();
		driver.findElement(By.xpath("//li[@class='dropdown open']/ul/li[4]/a")).click();
		
		WebElement element= driver.findElement(By.id("multi-select"));
		Select elm=new Select(element);
		elm.selectByIndex(1);
		elm.selectByVisibleText("Ohio");
		elm.selectByValue("Texas");
		elm.deselectAll();
		
		List<WebElement> option=elm.getOptions();
		System.out.println(option.size()); 
		for (WebElement str:option) {
			
			str.click();
			System.out.println(str.getText());
		}
		
	}

}
