package com.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class WebTableDemo2 extends CommonMethods{
	public static void main(String[] args) {
	setUp("chrome",Constants.SYNTAX_PRACTICE_URL);
	driver.findElement(By.linkText("Table")).click();
	driver.findElement(By.linkText("Table Data Search")).click();

	List<WebElement> row= driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
	System.out.println("Number of row "+row.size());
	for(WebElement rowList:row) {
		String str=rowList.getText();
		System.out.println(str);
	}
	
	List<WebElement> cols= driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
	System.out.println("Number of column "+cols.size());
	Iterator<WebElement> colList= cols.iterator();
    while(colList.hasNext()){
		WebElement column=colList.next();
		System.out.println(column.getText());
	}	
		//printing data cell by cell
		List<WebElement> cells= driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));	
		for(WebElement cell:cells) {
		String cellData =cell.getText();
		System.out.println(cellData);
		}
	//printing data cell by cell using for loop
		
		for(int i=1; i<=row.size(); i++) {
			for(int y=1; i<=cols.size(); i++) {
				String cellText=driver.findElement(By.xpath("table[@class='table']/tbody/tr[" +i+ "]/td[" +y+ "]")).getText();
				System.out.println(cellText);
			} 
		}
		
	
	}	
}