package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ReportPageElements extends CommonMethods{
	
	
	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']/b")
	public WebElement pim;
	
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	public WebElement report;
	
	@FindBy(id="search_search")
	public WebElement reportName;
	
	@FindBy(xpath="//table[@id='resultTable'][tbody]")
	public WebElement noRecordsFound;
	
	@FindBy(xpath="//input[@value='Search']")
	public WebElement search;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[2]")
	public WebElement validSearchResult;
	
	public ReportPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void navigateToReportPage() {
		click(pim);
		click(report);
	}
}
