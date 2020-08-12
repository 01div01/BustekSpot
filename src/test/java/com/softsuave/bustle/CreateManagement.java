package com.softsuave.bustle;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CreateManagement extends BaseClass
{
	By clickOnButton=By.xpath("//div[@class='hmi-div']");
	By organiseButton=By.xpath("//span[@class='MuiButton-label']");
	By addOrganisationLink=By.xpath("//button[@class='jss307']");
	By organisationName=By.xpath("//input[@name='organisation-name']");
	By organisationDes=By.xpath("//textarea[@name='organisation-description']");
	//By fileimg=By.xpath("//div[@class='fu-cont']");
	By submitBut=By.xpath("//button[@class='of-submit-btn']");
	By statusMsg = By.xpath("//div[@class='message-sec']/p[1]");
	By statusTxt=By.xpath("//div[@class='message-sec']/p[2]");
	
	public void clickOnButton() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.findElement(clickOnButton).click();
		driver.findElement(organiseButton).click();
		driver.findElement(addOrganisationLink).click();
	}
	public void enterOrganisationName(String name)
	{
		driver.findElement(organisationName).sendKeys(name);
	}
	public void enterOrganisationDes(String name)
	{
		driver.findElement(organisationDes).sendKeys(name);
	}
	//public void fileImage()
	//{
	//	driver.findElement(fileimg).sendKeys("C:\\Users\\Softsuave\\Desktop\\BustelSpot\\BustleMaven\\src\\test\\java\\com\\softsuave\\resources\\Screenshot (4).png");;
	//}
	public void submitButton()
	{
		driver.findElement(submitBut).click();
		
	}
	public String submitButtonDuplicate()
	{
		driver.findElement(submitBut).click();
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
		    String expectedTextSucess="SucessFully created";
		    Assert.assertEquals(actualTextSucess, expectedTextSucess);
		    break;
		  case "ERROR!":
			  String actualText=driver.findElement(statusTxt).getText();
			    System.out.println(actualText);
			    String expectedText="Duplicate entry 'First Organisation' for key 'name_UNIQUE'";
			    Assert.assertEquals(actualText, expectedText);
			    break;
			    
		}
	}
	

}
