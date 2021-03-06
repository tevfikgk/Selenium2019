package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsDemo1 {
	 
	public static final String URL= "http://166.62.36.207/humanresources/symfony/web/index.php/recruitment/viewCandidates";
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		userName.sendKeys("Admin");
		//Thread.sleep(3000);
		//userName.clear();   //it will clear the text box
		//userName.sendKeys("helen");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ttgg123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Stroring the error message element
		WebElement errorMessage= driver.findElement(By.xpath("//span[@id='spanMessage']"));
		
		//System.out.println(errorMessage.isDisplayed());
		//String errMesg= errorMessage.getText();
		//System.out.println(errMesg);
		
		// or;
		
		if (errorMessage.isDisplayed()) {
			errorMessage.getText();
			if(errorMessage.getText().equals("Invalid creditials")) {
				System.out.println("You are good.");
			}else {
				System.err.println("you are not good");            //********* rengi kirmizi basti
			}
			}
		//}
	}

}
