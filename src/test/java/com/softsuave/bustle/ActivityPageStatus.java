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
	
	public String getTotalHours()
	{
		String actualTotalHour= driver.findElement(totalHoursValue).getText();
		return actualTotalHour;
	}
	public String getTotalBillableHours()
	{
		String actualBillableTotalHour= driver.findElement(totalBillableHoursValue).getText();
		return actualBillableTotalHour;	
	}
	public String getTotalActivity()
	{
		String actualtotalActivityValue= driver.findElement(totalActivityValue).getText();
		return actualtotalActivityValue;
	}
	public String getTotalNoofUsers()
	{
		String actualtotalNoofUsersValue= driver.findElement(totalNoofUsersValue).getText();
		return actualtotalNoofUsersValue;
	}
	
	public void validationActivityPage(String element)
	{
		switch(element) 
		{
		  case "Total Hours":
			 System.out.println(element);
			 String actualTotalHour=getTotalHours();
			 System.out.println(actualTotalHour);
			 String expectedTotalHour="00:34";
			 Assert.assertEquals(actualTotalHour, expectedTotalHour);
			 break;
		  case "Total Billable Hours":
			  System.out.println(element);
		  	 String actualBillableTotalHour=getTotalBillableHours();
		  	 System.out.println(actualBillableTotalHour);
			 String expectedTotaBillablelHour="00:34";
			 Assert.assertEquals(actualBillableTotalHour, expectedTotaBillablelHour);
			 break;
		  case "Total Activity":
			  System.out.println(element);
			 String actualtotalActivityValue=getTotalActivity();
			 System.out.println(actualtotalActivityValue);
			 String expectedtotalActivityValue="75%";
			 Assert.assertEquals(actualtotalActivityValue, expectedtotalActivityValue);
			 break;
		  case "Total No of Users":
			  System.out.println(element);
		  	 String actualtotalNoofUsersValue= getTotalNoofUsers();
		  	 System.out.println(actualtotalNoofUsersValue);
			 String expectedtotalNoofUsersValue="1";
			 Assert.assertEquals(actualtotalNoofUsersValue, expectedtotalNoofUsersValue);
			 break;
			  
		}
		
	}
	
	

}
