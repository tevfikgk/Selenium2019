package com.class07;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class FluentWaitDemo extends CommonMethods{

public static void main(String[] args) {
	
	
	FluentWait wait = new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(30));
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.ignoring(NoSuchElementException.class);
}
		
		
		
		
		
	}


