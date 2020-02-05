package com.class11;

import com.utils.CommonMethods;

public class MethodTest extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	setUp("chrome","https://expedia.com");
	scrollDown(1000);
	Thread.sleep(3000);
	scrollUp(1000);
	Thread.sleep(3000);
	driver.quit();
	
}
}
