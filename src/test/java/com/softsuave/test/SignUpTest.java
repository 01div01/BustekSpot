package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.SignUp;
import com.softsuave.bustle.SignUpText;

public class SignUpTest extends SignUp
{
	@Test
	public void signUpAppNewUser()
	{
		clickOnSignUp();
		enterEmail("dimcsdfs@gmail.com");
		enterName("div");
		enterPass("1234567@aA");
		enterConfirmPass("1234567@aA");
		String status=clickOnSubmit();
		validation(status);
	}
	@Test
	public void signUpAppOldUser()
	{
		clickOnSignUp();
		enterEmail("ind1div@gmail.com");
		enterName("div");
		enterPass("1234567@aA");
		enterConfirmPass("1234567@aA");
		String status=clickOnSubmit();
		validation(status);
	}
	@Test
	public void signUpAppInvalid()
	{
		SignUpText st=new SignUpText();
		st.clickOnSignUp();
		st.enterEmail("");
		st.enterName("div");
		st.enterPass("1234567");
		st.enterConfirmPass("12fd34567");
		st.clickOnSubmit();
		st.sizeText();
		st.getText();
	}
	

}