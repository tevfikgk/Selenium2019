package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.ReportPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ReportSteps extends CommonMethods{
	
	ReportPageElements reportPage;
	@Given("I navigated to Reports Page")
	public void i_navigated_to_Reports_Page() {
		reportPage=new ReportPageElements();
		reportPage.navigateToReportPage();
	
	}

	@When("I enter invalid report")
	public void i_enter_invalid_report() {
	   reportPage.reportName.sendKeys("abc");
	}
	@When("I click search button")
	public void i_click_search_button() {
	    click(reportPage.search);
	}
	@Then("I see no record found error message")
	public void i_see_no_record_found_error_message() {
	   String noRecord= reportPage.noRecordsFound.getText();
	   String expect= "No Records Found";
	   Assert.assertEquals(expect, noRecord);
	}

	@When("I enter valid report")
	public void i_enter_valid_report() {
		reportPage.reportName.sendKeys("Candidates");
	}

	@Then("I see search report displayed")
	public void i_see_search_report_displayed() {
	    boolean isExpected= reportPage.validSearchResult.isDisplayed();
		
	    Assert.assertTrue(isExpected);
	}

}
