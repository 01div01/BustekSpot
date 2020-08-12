package com.softsuave.bustle;

import org.openqa.selenium.By;
import org.testng.Assert;



public class ActivityPageStatus extends BaseClass
{
	By totalHoursText=By.xpath("(//p[@class='jss146'])[1]");
	By totalBillableHoursText=By.xpath("(//p[@class='jss146'])[2]");
	By totalActivityText=By.xpath("(//p[@class='jss146'])[3]");
	By totalNoofUsersText=By.xpath("(//p[@class='jss146'])[4]");
	
	By totalHoursValue=By.xpath("(//p[@class='jss147'])[1]");
	By totalBillableHoursValue=By.xpath("(//p[@class='jss147'])[2]");
	By totalActivityValue=By.xpath("(//p[@class='jss147'])[3]");
	By totalNoofUsersValue=By.xpath("(//p[@class='jss147'])[4]");
	

	
	
	
	public String totalHours()
	{
		String text=driver.findElement(totalHoursText).getText();
		System.out.println(text);
		return text;
	}
	public String totalBillableHours()
	{
		String text=driver.findElement(totalBillableHoursText).getText();
		System.out.println(text);
		return text;	
	}
	public String totalActivity()
	{
		String text=driver.findElement(totalActivityText).getText();
		System.out.println(text);
		return text;
	}
	public String totalNoofUsers()
	{
		String text=driver.findElement(totalNoofUsersText).getText();
		System.out.println(text);
		return text;
	}
	
	public void validation(String element)
	{
		switch(element) 
		{
		  case "Total Hours":
			 String actualTotalHour= driver.findElement(totalHoursValue).getText();
			 System.out.println(actualTotalHour);
			 String expectedTotalHour="00:34";
			 Assert.assertEquals(actualTotalHour, expectedTotalHour);
			 break;
		  case "Total Billable Hours":
		  	 String actualBillableTotalHour= driver.findElement(totalBillableHoursValue).getText();
		  	 System.out.println(actualBillableTotalHour);
			 String expectedTotaBillablelHour="00:34";
			 Assert.assertEquals(actualBillableTotalHour, expectedTotaBillablelHour);
			 break;
		  case "Total Activity":
			 String actualtotalActivityValue= driver.findElement(totalActivityValue).getText();
			 System.out.println(actualtotalActivityValue);
			 String expectedtotalActivityValue="75%";
			 Assert.assertEquals(actualtotalActivityValue, expectedtotalActivityValue);
			 break;
		  case "Total No of Users":
		  	 String actualtotalNoofUsersValue= driver.findElement(totalNoofUsersValue).getText();
		  	 System.out.println(actualtotalNoofUsersValue);
			 String expectedtotalNoofUsersValue="1";
			 Assert.assertEquals(actualtotalNoofUsersValue, expectedtotalNoofUsersValue);
			 break;
			  
		}
		
	}
	
	

}
