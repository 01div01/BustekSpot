package com.softsuave.bustle;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ForgetPassword extends BaseClass{
	
	By forgetlink=By.className("jss84");
	By forgetemail=By.name("email-id");
	By submitbutton=By.xpath("//button[@class='jss27']");
	By statusMsg = By.xpath("//div[@class='message-sec']/p");
	By statusTxt=By.xpath("//div[@class='message-sec']/p[2]");
	By errormessage=By.xpath("//label[@class='jss77']");
	By loginLink=By.xpath("//a[text()='Login']");
	By loginPageVerification=By.xpath("//p[text()='Sign in to your account']");

	public String forgetPassword(String email)
	{
		driver.get("http://bustle-spot.com/login");
		WebElement forgetpass = driver.findElement(forgetlink);
		forgetpass.click();
		WebElement forgetemailtext = driver.findElement(forgetemail);
	
		forgetemailtext.sendKeys(email);
		
		returnWebElement(submitbutton).click();
		
		waitForElement(statusMsg);
		String actualMessage = driver.findElement(statusMsg).getText();
		return actualMessage;

	}
	public String forgetPasswordErrorMessage(String email)
	{
		driver.get("http://bustle-spot.com/login");
		WebElement forgetpass = driver.findElement(forgetlink);
		forgetpass.click();
		WebElement forgetemailtext = driver.findElement(forgetemail);
	
		forgetemailtext.sendKeys(email);
		
		returnWebElement(submitbutton).click();
		
		waitForElement(errormessage);
		String actualMessage = driver.findElement(errormessage).getText();
		return actualMessage;

	}
	public void getLoginLink()
	{
		driver.get("http://bustle-spot.com/login");
		WebElement forgetpass = driver.findElement(forgetlink);
		forgetpass.click();
		WebElement loginLinkEle=driver.findElement(loginLink);
		loginLinkEle.click();
		String acutualLoginText=driver.findElement(loginPageVerification).getText();
		String expectedLoginText="Sign in to your account";
		Assert.assertEquals(acutualLoginText, expectedLoginText);
	}
	public void validation(String status)
	{
		switch(status) 
		{
		  case "SUCCESS!":
			String actualTextSucess=driver.findElement(statusTxt).getText();
		    System.out.println(actualTextSucess);
		    String expectedTextSucess="Mail has been sent to ind1div@gmail.com";
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
			  		String expectedTextError="No User was found";
			  		Assert.assertEquals(actualTextErrorNoUserFound, expectedTextError);
			  		
			  	}
		    break;
		  default:
			  String actualTextErrorEmailId = driver.findElement(errormessage).getText();
			  if(actualTextErrorEmailId.contains("enter a valid mail"))
			  {
				  System.out.println(actualTextErrorEmailId);
				  String expectedTextErrorEmailId="Please enter a valid mail id.";
				  Assert.assertEquals(actualTextErrorEmailId, expectedTextErrorEmailId);
			  }
			  else
			  {
				  System.out.println("Mandotary Filed"+" "+actualTextErrorEmailId);
				  String expectedTextErrorEmailId="Required";
				  Assert.assertEquals(actualTextErrorEmailId, expectedTextErrorEmailId);
			  }
		}
	}	

	

}
