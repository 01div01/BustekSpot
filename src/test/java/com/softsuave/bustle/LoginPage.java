package com.softsuave.bustle;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class LoginPage extends BaseClass
{
	WebElement emailIDElement;
	WebElement passwordElement ;
	By emailID = By.xpath("//input[@placeholder='Enter your email address']");
	By password = By.xpath("//input[@placeholder='Enter your password']");
	By login = By.xpath("//button[text()='Login']");
	By statusMsg = By.xpath("//div[@class='message-sec']/p[1]");
	By statusTxt=By.xpath("//div[@class='message-sec']/p[2]");
	
	By errormessage=By.xpath("//label[@class='jss77']");
	
	public void loginToApplicationValid()
	{
		loginToApplicationValid("ind1div@gmail.com", "25111994");
	}
	private void launch()
	{
		driver.get("http://bustle-spot.com/");
		emailIDElement = driver.findElement(emailID);
		passwordElement = driver.findElement(password);
		//
	}
	public String loginToApplicationValid(String email, String pwd)
	{
		launch();
		emailIDElement.sendKeys(email);
		passwordElement.sendKeys(pwd);
		returnWebElement(login).click();
		waitForElement(statusMsg);
		String actualMessage = driver.findElement(statusMsg).getText();
		return actualMessage;
	}
	public String loginToApplicationInvalidEmail(String email, String pwd)
	{
		launch();
		emailIDElement.sendKeys(email);
		passwordElement.sendKeys(pwd);
		returnWebElement(login).click();
		waitForElement(statusMsg);
		String actualMessage = driver.findElement(statusMsg).getText();
		return actualMessage;
	}
	public String loginToApplicationInvalidCredentials(String email, String pwd)
	{
		launch();
		emailIDElement.sendKeys(email);
		passwordElement.sendKeys(pwd);
		returnWebElement(login).click();
		waitForElement(statusMsg);
		String actualMessage = driver.findElement(statusMsg).getText();
		Assert.assertEquals("ERROR!", actualMessage);
		return actualMessage;
	}
	public String loginToApplicationShortMail(String email, String pwd)
	{
		launch();
		emailIDElement.sendKeys(email);
		passwordElement.sendKeys(pwd);
		returnWebElement(login).click();
		waitForElement(errormessage);
		String actualErrorText = driver.findElement(errormessage).getText();
		
		return actualErrorText;
	}
	public String loginToApplicationNoData(String email, String pwd)
	{
		launch();
		emailIDElement.sendKeys(email);
		passwordElement.sendKeys(pwd);
		returnWebElement(login).click();
		waitForElement(errormessage);
		String actualErrorText = driver.findElement(errormessage).getText();
		
		return actualErrorText;
	}
	public void validationLoginPage(String status)
	{
		switch(status) 
		{
		  case "SUCCESS!":
			String actualTextSucess=driver.findElement(statusTxt).getText();
		    System.out.println(actualTextSucess);
		    String expectedTextSucess="SucessFully logg in";
		    Assert.assertEquals(expectedTextSucess, actualTextSucess);
		    break;
		  case "ERROR!":
			  	String actualTextError=driver.findElement(statusTxt).getText();
			  	if(actualTextError.contains("password"))
			  	{
				    System.out.println(actualTextError);
				    String expectedTextError="Wrong password entered";
				    Assert.assertEquals(actualTextError, expectedTextError);
			  	}
			  	else
			  	{
			  		String actualTextErrorNoUserFound=driver.findElement(statusTxt).getText();
			  		System.out.println(actualTextErrorNoUserFound);
			  		String expectedTextError="No User Found. Please Sign Up";
			  		Assert.assertEquals(actualTextErrorNoUserFound, expectedTextError);
			  		
			  	}
		    break;
		  case "enter a valid mail":
			  String actualTextErrorEmailId = driver.findElement(errormessage).getText();
			  
				  System.out.println(actualTextErrorEmailId);
				  String expectedTextErrorEnterEmailId="Please enter a valid mail id.";
				  Assert.assertEquals(actualTextErrorEmailId, expectedTextErrorEnterEmailId);
				  break;
		  case "Required":
			  
				  String actualTextErrorEmailIdRequired = driver.findElement(errormessage).getText();
				  System.out.println("Mandotary Filed"+" "+actualTextErrorEmailIdRequired);
				  String expectedTextErrorEmailIdRequired="Required";
				  Assert.assertEquals(actualTextErrorEmailIdRequired, expectedTextErrorEmailIdRequired);
				  break;
			  
		}
	}
	
	
	
}
