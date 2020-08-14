package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.LoginPage;
import com.softsuave.bustle.ProjectFunctionality;

public class ProjectFunctionalityTest extends ProjectFunctionality
{
	
	@Test
	public void projectFunctionality() throws InterruptedException
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		clickOnProjectButton();
		Thread.sleep(2000);
		searchFunctionality("Test Cases");
		clickOnAddMembers();
		clickOnInviteMembers();
		sendInviteMembers("abc@gmail.com");
		String status=clickOnSaveButton();
		validationProjectFunctionality(status);
		
	}
	@Test
	public void clickOnChageRole() throws InterruptedException
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		clickOnProjectButton();
		Thread.sleep(5000);
		clickOnChangeRole("Divyanshu");
	}
	@Test
	public void clickOnRemoveMember() throws InterruptedException
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		clickOnProjectButton();
		Thread.sleep(5000);
		clickOnRemoveMember("Divyanshu");
	}

}
