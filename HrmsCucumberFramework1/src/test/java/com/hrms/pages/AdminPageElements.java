package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.testbase.BaseClass;

public class AdminPageElements {
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement adminClick;
	
	//system user test
	@FindBy(xpath="//a[@class='toggle tiptip']")
	public WebElement SystemUser;
	//insert input user name
	@FindBy(id="searchSystemUser_userName")
	public WebElement userName;
	
	//dropdown
	@FindBy(id="searchSystemUser_userType") 
	public WebElement userRole;
	
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	public WebElement empName;
	
	//@FindBy(id="searchSystemUser_status")
	public WebElement status;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	//@FindBy(linkText="hasan1")
	public WebElement userResult;
	
	@FindBy(linkText="No Records Found")
	public WebElement noRecordFound;
	
	public AdminPageElements() {
		PageFactory.initElements(BaseClass.driver, this);	
	}
	
//	public void navigateToAdmin() {
//	click(adminClick);
//	}

	
}
