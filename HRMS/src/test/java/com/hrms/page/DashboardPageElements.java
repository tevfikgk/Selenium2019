package com.hrms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{

	@FindBy(linkText="Leave List")
	public WebElement leaveLink;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy(linkText="Assign Leave")
	public WebElement assignLeave;
	
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText="Timesheets")
	public WebElement timesheets;
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToLeaveList() {
		click(leaveLink);
		//click(pim) eski sitede vardi
	}
	public void navigateToAddEmployee() {
		click(pim);
		click(addEmp);
	}
}
