package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");  //hypertext transfer protocol source
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("this is the right title");
		} else {
			System.out.println("sorry this is not the title");
		}
		//driver.findElement(By.name("q")).sendKeys("hello");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.className("gb_g")).click();
		
		//**         //tag[@attribute=’value’] 
		
		driver.findElement(By.xpath("//a[@ga-on='_click']")).click();
		
		/*Thread.sleep(1000);
		driver.navigate().to("http://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		String actualTitle=driver.getTitle();
		driver.close();*/
	}

}
