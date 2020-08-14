package com.softsuave.bustle;

import org.openqa.selenium.By;

public class SignOutFunctionality extends BaseClass{
	By clcikOnProfile=By.xpath("(//*[@class='MuiIconButton-label'])[2]");
	By signOutButton=By.xpath("//*[text()='Signout']");
	public void clickOnSignOut()
	{
		LoginPage l=new LoginPage();
		l.loginToApplicationValid();
		
		driver.findElement(clcikOnProfile).click();
		driver.findElement(signOutButton).click();
	}


}
