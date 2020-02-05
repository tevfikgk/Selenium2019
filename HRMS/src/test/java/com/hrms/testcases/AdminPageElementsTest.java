package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.page.AdminPageElements;
import com.hrms.page.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class AdminPageElementsTest extends CommonMethods{

	@Test(groups="regression")
	public void AddPageValidation() throws InterruptedException {
	LoginPageElements login=new LoginPageElements();
	AdminPageElements adminPage=new AdminPageElements();
	
	login.login("Admin", "Syntax@123");
	jsClick(adminPage.adminClick);
	Thread.sleep(3000);
	Assert.assertTrue(adminPage.SystemUser.isDisplayed(), "System User message NOT displayed");
	Thread.sleep(5000);
	sendText(adminPage.userName, "tevfikgk");
	sendText(adminPage.empName, "tevfik");
	click(adminPage.searchBtn);
//	String actualTitle="No Records Found";
//	Assert.assertEquals(actualTitle, adminPage.noRecordFound.getText(), "Message is not match");
	}
	
}
