package com.class03;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebElement {
	
	
		public static final String URL= "https://www.ebay.com/";
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\tevfi\\eclipse-workspace\\SeleniumBatchV\\drivers\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get(URL);
			List<WebElement> listATag=driver.findElements(By.tagName("a"));
			int size=listATag.size();
			System.out.println(size);
			
			listATag.get(11);
			int count=0;
			
			/*Iterator <WebElement> it=listATag.iterator();
			while (it.hasNext()) {
			String tag= it.next().getText();
				System.out.println(tag);
			}*/
			//or
			for (WebElement link:listATag) {
				String str=link.getText();
				if (!str.isEmpty()){
					System.out.println(str);
					count++;
				}
			} System.out.println("total number is "+size+" and with text is="+count);
			driver.close();
}
		
}
