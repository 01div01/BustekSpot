package com.softsuave.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.softsuave.bustle.ActivityPage;
import com.softsuave.bustle.LoginPage;

public class ActivityTest extends ActivityPage{
	@Test
	public void activityPagetest() throws AWTException{
	LoginPage login = new LoginPage();
	login.loginToApplicationValid();
	selectProject("Test Cases");
	selectName("Divyanshu");
	selectDateFromCalendar("2","July","2019");
	selectDateToCalendar("15","August","2019");
	
	}
	@Test
	public void activityPagetestParticularRangeButton() throws AWTException{
	LoginPage login = new LoginPage();
	login.loginToApplicationValid();
	selectProject("Test Cases");
	selectName("Divyanshu");
	selectDateFromCalendar("2","July","2019");
	
	clickOnToday();
	clickOnYestarday();
	clickOnThisWeek();
	clickOnLastWeek();
	clickOnThisMonth();
	clickOnLastMonth();
	//selectDateToCalendar("15","August","2019");
	}

}
