package com.class03;
import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

public class HRPMSAplicationLogin {
			public static final String URL= "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
			public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();;
		
		WebElement emptyMessage= driver.findElement(By.xpath("//span[@id='spanMessage']"));
		emptyMessage.isDisplayed();
		if (errorMessage.equalsIgnoreCase("Password cannot be Empty")) {
		System.out.println("everything goes well");
		} else {System.out.println("something goes wrong");}
	}
		}