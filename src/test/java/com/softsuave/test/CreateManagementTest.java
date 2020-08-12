package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.CreateManagement;
import com.softsuave.bustle.LoginPage;

public class CreateManagementTest extends CreateManagement
{
	@Test
	public void createOrganisation() throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		lp.loginToApplicationValid();
		clickOnButton();
		enterOrganisationName("First12 Organisation");
		enterOrganisationDes("some discription");
		//fileImage();
		submitButton();
	}
	@Test
	public void createOrganisationDublicates() throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		lp.loginToApplicationValid();
		clickOnButton();
		enterOrganisationName("First Organisation");
		enterOrganisationDes("some discription");
		//fileImage();
		String status=submitButtonDuplicate();
		validation(status);
		
	}

}
