package com.softsuave.test;

import org.testng.annotations.Test;

import com.softsuave.bustle.LoginPage;
import com.softsuave.bustle.MembersFunctionality;

public class MembersFunctionalityTest extends MembersFunctionality
{
	@Test
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
	}
	@Test
	public void clickOnInvite()
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		
		clickOnMembersButton();
		memberInviteFunctionality();
	}
	@Test
	public void clickOnResendInvitationLink()
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		clickOnMembersButton();
		memberInviteFunctionality();
		clickOnResendButton("div9349@gmail.com");
	}
	@Test
	public void clickOnRemoveInviteeLink()
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		clickOnMembersButton();
		memberInviteFunctionality();
		clickOnRemoveIviteeButton("div9349@gmail.com");
	}
//	@Test
//	public void clickOnMemberList()
//	{
//		LoginPage l=new LoginPage();
//		l.loginToApplicationValid();
//		clickOnMembersButton();
//		//clickOnMemberList();
//	}

}
