package com.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;
import com.utils.Constants;
//Drag and drop homework

public class DragAndDraw extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
	setUp("chrome", "https://jqueryui.com/");
	driver.findElement(By.linkText("Droppable")).click();
	Thread.sleep(2000);
	
	//Go inside the frame
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	
	//drag and drop
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop).perform();
	
	//test result confirmation
	if (drop.getText().equals("Dropped!")) {
		System.out.println("Tess passed");
	}else {
		System.out.println("Test failed");
	}
	Thread.sleep(2000);
	//take screenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	File screen= ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(screen, new File("screenshots/HRMS/DragAndDrop.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Thread.sleep(2000);
	driver.quit();
	}
}