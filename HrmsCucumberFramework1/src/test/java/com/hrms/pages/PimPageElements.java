package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class PimPageElements extends CommonMethods {

	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pimMenu;
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmployee;
	//firstname, last name
	@FindBy(id="firstName")
	public WebElement addFirstName;
	@FindBy(id="lastName")
	public WebElement addLastName;
	//click login details
	@FindBy(id="chkLogin")
	public WebElement createLogInDetails;
	//username,password
	@FindBy(id="user_name")
	public WebElement userName;
	@FindBy(id="user_password")
	public WebElement password;
	@FindBy(id="re_password")
	public WebElement repassword;
	//save
	@FindBy(id="btnSave")
	public WebElement saveButton;
	//User add confirm
	@FindBy(id="personal_txtEmpFirstName")
	public WebElement addComfirm;
	
	public PimPageElements() {
		PageFactory.initElements(BaseClass.driver, this);	
	}	
	public void userInfo(String unm, String psw, String rePsw) {
		sendText(userName, unm);
		sendText(password, psw);
		sendText(repassword, rePsw);
	}
}