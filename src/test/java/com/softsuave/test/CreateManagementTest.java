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
		validationCreateManagement(status);
		
	}
	@Test
	public void editManagementFunctionality() throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		lp.loginToApplicationValid();
		
		Thread.sleep(5000);
		
		editManagement("Dem12");
		enterOrganisationNameEdit("Demo");
		enterOrganisationDesEdit("some other des");
		submitButton();
		
	}
	@Test
	public void deleteManagementFunctionality() throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		lp.loginToApplicationValid();
		
		Thread.sleep(5000);
		
		deleteManagement("Dem12");
		Thread.sleep(3000);
		//clickOnYesButton();
		
		
	}
	@Test
	public void clickOnParticularManagementTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		lp.loginToApplicationValid();
		
		Thread.sleep(5000);
		clickOnParticularManagement("First Organisation");
	}

}
