package com.hrms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class LoginPageElements extends CommonMethods{

	
	@FindBy(xpath="//div[@id='divLogo']")
	public WebElement logo;
	
	@FindBy(id="LogInPaneHeading")
	public WebElement loginLabel;
	
	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(css="input#txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(id="spanMessage")
	public WebElement errorMsg;
	
	public LoginPageElements() {
	PageFactory.initElements(BaseClass.driver, this);	
	}
	
	public void login(String uid, String pwd) {
		sendText (userName, uid);
		sendText(password, pwd);
		click(loginBtn);
	}	

}
