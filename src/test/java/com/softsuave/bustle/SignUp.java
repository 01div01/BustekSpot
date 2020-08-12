package com.softsuave.bustle;

import org.openqa.selenium.By;

import org.testng.Assert;

public class SignUp extends BaseClass
{
	By signUpLink=By.xpath("//a[@class='jss84' and text()='Sign Up']");
	By email=By.xpath("//input[@name='email-id']");
	By fullName=By.xpath("//input[@name='first-name']");
	By pass=By.xpath("//input[@name='password']");
	By confirmPass=By.xpath("//input[@name='confirm-password']");
	By signUpButton=By.xpath("//button[.='Sign Up']");
	
	By statusMsg = By.xpath("//div[@class='message-sec']/p");
	By statusTxt=By.xpath("//div[@class='message-sec']/p[2]");
	By errormessage=By.xpath("//label[@class='jss77']");
	
	
	
	public void clickOnSignUp()
	{
		driver.get("http://bustle-spot.com/");
		driver.findElement(signUpLink).click();
	}
	public void enterEmail(String emailid)
	{
		driver.findElement(email).sendKeys(emailid);;
	}
	public void enterName(String name)
	{
		driver.findElement(fullName).sendKeys(name);
	}
	public void enterPass(String pas)
	{
		driver.findElement(pass).sendKeys(pas);
	}
	public void enterConfirmPass(String cpass)
	{
		driver.findElement(confirmPass).sendKeys(cpass);
	}
	public String clickOnSubmit()
	{
		driver.findElement(signUpButton).click();
		waitForElement(statusMsg);
		String sucessMsgtext = driver.findElement(statusMsg).getText();
		return sucessMsgtext;
	}
	public void validation(String status)
	{
		switch(status) 
		{
		  case "SUCCESS!":
			String actualTextSucess=driver.findElement(statusTxt).getText();
		    System.out.println(actualTextSucess);
		    String expectedTextSucess="You are successfully registered. Please check you email to receive the invite";
		    Assert.assertEquals(expectedTextSucess, actualTextSucess);
		    break;
		  case "ERROR!":
			  	
			  		String actualTextErrorNoUserFound=driver.findElement(statusTxt).getText();
			  		System.out.println(actualTextErrorNoUserFound);
			  		String expectedTextError="Duplicate entry 'ind1div@gmail.com' for key 'email_UNIQUE'";
			  		Assert.assertEquals(actualTextErrorNoUserFound, expectedTextError);
			  		
			  	
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
