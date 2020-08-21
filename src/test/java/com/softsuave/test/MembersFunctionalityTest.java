package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.LoginPage;
import com.softsuave.bustle.MembersFunctionality;
import com.softsuave.bustle.SignOutFunctionality;

public class MembersFunctionalityTest extends MembersFunctionality
{
	@Test (priority=3)
	public void membersFunctionality() throws InterruptedException
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		
		clickOnMembersButton();
		searchFunctionality("Divyanshu");
		Thread.sleep(6000);
		clickOnAssignProject();
		selectProject("Test Cases");
		selectRole("Project Manager");
		Thread.sleep(2000);
		SignOutFunctionality s=new SignOutFunctionality();
		s.clickOnSignOut();
		
	}
	@Test(priority=1)
	public void clickOnInvite() throws InterruptedException
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		
		clickOnMembersButton();
		memberInviteFunctionality();
		Thread.sleep(2000);
		SignOutFunctionality s=new SignOutFunctionality();
		s.clickOnSignOut();
	}
	@Test(priority=4)
	public void clickOnResendInvitationLink() throws InterruptedException
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		clickOnMembersButton();
		memberInviteFunctionality();
		clickOnResendButton("div9349@gmail.com");
		Thread.sleep(2000);
		SignOutFunctionality s=new SignOutFunctionality();
		s.clickOnSignOut();
		
	}
	@Test(priority=2)
	public void clickOnRemoveInviteeLink() throws InterruptedException
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		clickOnMembersButton();
		memberInviteFunctionality();
		clickOnRemoveIviteeButton("div9349@gmail.com");
		
	}
	

}
