package com.softsuave.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.softsuave.bustle.ProjectFunctionality;
import com.softsuave.bustle.SignOutFunctionality;

public class ProjectFunctionalityTest extends ProjectFunctionality
{
	@BeforeMethod
	public void clickOnProjectBeforeAllMethod() throws InterruptedException
	{
		
		LoginTest l=new LoginTest();
		l.loginToApplicationValid();
		clickOnProjectButton();
		Thread.sleep(2000);
		
	}
	
	@Test(priority =1)
	public void projectFunctionality() throws InterruptedException
	{
		
		searchFunctionality("Test Cases");
		clickOnAddMembers();
		clickOnInviteMembers();
		sendInviteMembers("abc@gmail.com");
		String status=clickOnSaveButton();
		validationProjectFunctionality(status);
		Thread.sleep(2000);
		SignOutFunctionality s=new SignOutFunctionality();
		s.clickOnSignOut();
	}
	@Test(priority =1)
	public void clickOnChageRole() throws InterruptedException
	{
		
		clickOnChangeRole("Divyanshu");
		Thread.sleep(2000);
		SignOutFunctionality s=new SignOutFunctionality();
		s.clickOnSignOut();
	}
	@Test(priority =2)
	public void clickOnRemoveMember() throws InterruptedException
	{
		
		clickOnRemoveMember("Divyanshu");
		Thread.sleep(2000);
		//SignOutFunctionality s=new SignOutFunctionality();
		//s.clickOnSignOut();
	}
	

}
