package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.LoginPage;
import com.softsuave.bustle.SignOutFunctionality;

public class SignOutTest extends SignOutFunctionality{
	@Test
	public void signOutFun() throws InterruptedException
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		
		clickOnSignOut();
	}
}
