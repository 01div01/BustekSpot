package com.softsuave.test;


import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.softsuave.bustle.TaskFunctionality;

public class TaskTest extends TaskFunctionality
{
	@BeforeMethod
	public void clickOnTaskBeforeAllMethod() throws InterruptedException
	{
		LoginTest l=new LoginTest();
		l.loginToApplicationValid();
		
		clickOnTaskButton();
		
	}
	
//	@AfterMethod
//	public void closeTheBrowser()
//	{
//		driver.quit();
//	}
	
	@Test
	public void addTaskTestFunctionality() throws InterruptedException
	{
		Thread.sleep(5000);
		searchFunctionality("Test Cases");
		clickOnAddTask();
		enterTaskNameTask("First Task");
		enterTaskDescription("First Task Description");
		String status=clickOnSaveButton();
		validationTaskFunctionality(status);
		
	}
	@Test
	public void cancleTaskTestFunctionality() throws InterruptedException
	{
		Thread.sleep(5000);
		searchFunctionality("Test Cases");
		clickOnAddTask();
		enterTaskNameTask("First Task");
		enterTaskDescription("First Task Description");
		clickOnCancleButton();
		validationTaskFunctionality("Cancle");
	}
	@Test
	public void editFunctionality() throws InterruptedException 
	{
		Thread.sleep(500);
		clickOnEditButton("First Task");
		sendEditedTaskNameText("1st Task");
		sendEditedTaskDescription("1st Task New Description");
		clickOnSaveButton();
		validationTaskFunctionality("Task Edited");
	}
	@Test
	public void deleteFunctionalityYes() throws InterruptedException 
	{
		Thread.sleep(500);
		clickOnDeleteButton("First Task");
		clickOnYesButton();
		validationTaskFunctionality("Task Deleted");
	}
//	@Test
//	public void deleteFunctionalityNo() throws InterruptedException 
//	{
//		
//		clickOnDeleteButtonClickOnNo("1st Task");
//	}



}
