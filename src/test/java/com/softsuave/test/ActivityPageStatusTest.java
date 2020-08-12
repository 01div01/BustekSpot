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
		text=totalHours();
		validation(text);
		text=totalBillableHours();
		validation(text);
		text=totalActivity();
		validation(text);
		text=totalNoofUsers();
		validation(text);
	}

}
