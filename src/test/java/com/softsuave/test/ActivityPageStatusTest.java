package com.softsuave.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.softsuave.bustle.ActivityPageStatus;
import com.softsuave.bustle.LoginPage;

public class ActivityPageStatusTest  extends ActivityPageStatus
{
	String text="";
//	@BeforeMethod
//	public void login()
//	{
//	}
	@Test
	public void getActivityTextTotalHours()
	{

		LoginPage login = new LoginPage();
		login.loginToApplicationValid();
		//text=totalHours();
		validationActivityPage("Total Hours");
		
	}
	@Test
	public void getActivityTextTotalBillableHours()
	{

		LoginPage login = new LoginPage();
		login.loginToApplicationValid();
		
		validationActivityPage("Total Billable Hours");
		
	}
	@Test
	public void getActivityTextTotalActivity()
	{
		

		LoginPage login = new LoginPage();
		login.loginToApplicationValid();
		//text=totalActivity();
		validationActivityPage("Total Activity");
		
	}
	@Test
	public void getActivityTextTotalNoofUsers()
	{

		LoginPage login = new LoginPage();
		login.loginToApplicationValid();
		
		//text=totalNoofUsers();
		validationActivityPage("Total No of Users");
	}
	

}
