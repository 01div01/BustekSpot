package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.ForgetPassword;

public class ForgetPasswordTest extends ForgetPassword
{
	@Test
	public void forgetPasswordValidEmailId()
	{
		String email="ind1div@gmail.com";
		String statusMessage=forgetPassword(email);
		validationForgetPassword(statusMessage);
	}
	@Test
	public void forgetPasswordInvalidEmailId()
	{
		String email="ind1dsdiv@gmail.com";
		String statusMessage=forgetPassword(email);
		validationForgetPassword(statusMessage);
	}
	@Test
	public void forgetPasswordShortEmailId()
	{
		String email="ind1div";
		forgetPasswordErrorMessage(email);
		validationForgetPassword("Please enter a valid mail id.");
	}
	@Test
	public void forgetPasswordNoData()
	{
		String email="";
		forgetPasswordErrorMessage(email);
		validationForgetPassword("required");
	}
	@Test
	public void clickOnLoginLinkInForgotPassword()
	{
		getLoginLink();
	}

}
