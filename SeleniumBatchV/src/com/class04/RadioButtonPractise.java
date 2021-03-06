package com.class04;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RadioButtonPractise extends CommonMethods {
/*TC 2: Radio Buttons Practice  
Open chrome browser
Go to �http://jiravm.centralus.cloudapp.azure.com:8081/index.html�
Click on �Input Forms� links
Click on �Radio Buttons Demo� links
Click on any radio button in �Radio Button Demo� section.
Verify correct checkbox is clicked
Click on any radio button in �Group Radio Buttons Demo� section.
Verify correct checkbox is clicked
Quit browser
*/
		public static final String HRMS_URL=  "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		
		public static void main(String[] args) {
			
			//CommonMethods.setUp("chrome");
			driver.get(HRMS_URL);
			driver.findElement(By.xpath("//a[@href='#']")).click();
			driver.findElement(By.linkText("Radio Buttons Demo")).click();
	}

}
