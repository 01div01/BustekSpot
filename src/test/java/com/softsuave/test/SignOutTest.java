package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.SignOutFunctionality;

public class SignOutTest extends SignOutFunctionality{
	@Test
	public void signOutFun()
	{
		clickOnSignOut();
	}
}
