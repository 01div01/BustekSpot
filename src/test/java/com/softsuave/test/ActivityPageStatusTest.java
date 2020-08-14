package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.ActivityPageStatus;
import com.softsuave.bustle.LoginPage;

public class ActivityPageStatusTest  extends ActivityPageStatus
{
	String text="";
	@Test
	public void getActivityText()
	{
		LoginPage login = new LoginPage();
		login.loginToApplicationValid();
		//text=totalHours();
		validationActivityPage("Total Hours");
		//text=totalBillableHours();
		validationActivityPage("Total Billable Hours");
		//text=totalActivity();
		validationActivityPage("Total Activity");
		//text=totalNoofUsers();
		validationActivityPage("Total No of Users");
	}

}
