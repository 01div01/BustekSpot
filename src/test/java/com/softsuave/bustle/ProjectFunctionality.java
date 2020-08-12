package com.softsuave.bustle;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProjectFunctionality extends BaseClass 
{
	By projectButton=By.xpath("//span[text()='Projects']");
	By searchTextField=By.xpath("//input[@placeholder='Search Projects']");
	By addMemberLink=By.xpath("//button[@class='jss300']");
	By inviteMember=By.xpath("//button[@class='jss126']");
	By enterEmail=By.xpath("//input[@name='email']");
	By saveButton=By.xpath("//button[text()='Save']");
	By statusMsg = By.xpath("//div[@class='message-sec']/p[1]");
	By statusTxt=By.xpath("//div[@class='message-sec']/p[2]");
	public void clickOnProjectButton()
	{
		driver.findElement(projectButton).click();	
	}
	public void searchFunctionality(String text)
	{
		driver.findElement(searchTextField).sendKeys(text);
		
	}
	public void clickOnAddMembers()
	{
		driver.findElement(addMemberLink).click();
		
	}
	public void clickOnInviteMembers()
	{
		driver.findElement(inviteMember).click();
		
	}
	public void sendInviteMembers(String email)
	{
		driver.findElement(enterEmail).sendKeys(email);
		
	}
	public String clickOnSaveButton() throws InterruptedException
	{
		driver.findElement(saveButton).click();
		Thread.sleep(5000);
		
		waitForElement(statusMsg);
		String actualMessage = driver.findElement(statusMsg).getText();
		return actualMessage;
		
	}
	public void validation(String status)
	{
		switch(status) 
		{
		  case "SUCCESS!":
			String actualTextSucess=driver.findElement(statusTxt).getText();
		    System.out.println(actualTextSucess);
		    String expectedTextSucess="SucessFully Invited";
		    Assert.assertEquals(actualTextSucess, expectedTextSucess);
		    break;
		  case "ERROR!":
			  String actualText=driver.findElement(statusTxt).getText();
			    System.out.println(actualText);
			    String expectedText="Project Manager can invite only his project";
			    Assert.assertEquals(actualText, expectedText);
			    break;
		}
	}
			  
	
	
	

}
