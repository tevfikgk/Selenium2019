package com.hrms.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.page.DashboardPageElements;
import com.hrms.page.LeaveListPageElements;
import com.hrms.page.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class LeaveListPageTest extends CommonMethods {

	@Test (groups="regression")
	public void leaveLabelvalidation() {
		LoginPageElements login=new LoginPageElements();
		DashboardPageElements dashboard=new DashboardPageElements();
		LeaveListPageElements leaveList=new LeaveListPageElements();
		sendText(login.userName, "Admin");
		sendText(login.password, "Syntax@123");
		click(login.loginBtn);
//		jsClick(dashboard.leaveLink);           //***********************************
//		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(), "Label is NOT displayed");
		
	}
	@Test (enabled=false, groups="regression")
	public void leaveLabelvalidation1() {
		LoginPageElements login=new LoginPageElements();
		DashboardPageElements dashboard=new DashboardPageElements();
		LeaveListPageElements leaveList=new LeaveListPageElements();
		login.login("Admin", "Syntax@123");
		dashboard.navigateToAddEmployee();
		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(), "Label is not displayed");
	}
}
