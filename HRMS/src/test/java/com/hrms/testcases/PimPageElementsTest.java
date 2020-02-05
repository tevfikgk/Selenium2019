package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.page.DashboardPageElements;
import com.hrms.page.LeaveListPageElements;
import com.hrms.page.LoginPageElements;
import com.hrms.page.PimPageElements;
import com.hrms.utils.CommonMethods;

public class PimPageElementsTest extends CommonMethods {

	
	@Test 
	public void pimPageValidation() throws InterruptedException {
	
	LoginPageElements login=new LoginPageElements();
	PimPageElements pimPage=new PimPageElements();
	login.login("Admin", "Syntax@123");
//	sendText(login.userName, "Admin");
//	sendText(login.password, "Syntax@123");
//	Thread.sleep(2000);
//	click(login.loginBtn);
	Thread.sleep(3000);
	click(pimPage.pimMenu);
	jsClick(pimPage.addEmployee);
	sendText(pimPage.addFirstName, "Mustafa");
	sendText(pimPage.addLastName, "Kemal");
	Thread.sleep(2000);
	click(pimPage.createLogInDetails);
	pimPage.userInfo("Kemal", "Kemal1881-1938", "Kemal1881-1938");
//	sendText(pimPage.userName, "Kemal");
//	sendText(pimPage.password, "Kemal1881-1938");
//	sendText(pimPage.repassword, "Kemal1881-1938");
	click(pimPage.saveButton);
	Thread.sleep(2000);
//	String expected="Mustafa";
//	Assert.assertEquals(pimPage.addComfirm.getText(), expected, "New user not added");
	}
}
