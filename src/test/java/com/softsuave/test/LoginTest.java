package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.LoginPage;

public class LoginTest extends LoginPage{
	@Test
	public void loginToApplicationValid()
	{
		String validEmailid="ind1div@gmail.com";
		String validpass="25111994";
		String status=loginToApplicationValid(validEmailid,validpass );
		validation(status);
	
	}
	@Test
	public void loginToApplicationInvalidEmail()
	{
		String inValidEmailid="ind1dfdiv@gmail.com";
		String validpass="25111994";
		String status=loginToApplicationInvalidCredentials(inValidEmailid, validpass);
		validation(status);
	}
	@Test
	public void loginToApplicationInvalidPassword()
	{
		String validEmailid="ind1div@gmail.com";
		String invalidpass="2511199s4";
		String status=loginToApplicationInvalidCredentials(validEmailid, invalidpass);
		validation(status);
	}
	@Test
	public void loginToApplicationShortMail()
	{
		String invalidEmailid="DDF";
		String invalidpass="FDS";
		loginToApplicationShortMail(invalidEmailid, invalidpass);
		validation("actualErrorText");
	}
	@Test
	public void loginToApplicationNoData()
	{
		String noEmailid="";
		String nopass="";
		loginToApplicationNoData(noEmailid, nopass);
		validation("actualErrorText");
	}
}
