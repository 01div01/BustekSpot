package com.softsuave.bustle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ActivityPage extends BaseClass
{
	By calendarIcon = By.xpath("//img[@alt='date-selector']");
	By monthDropDown = By.xpath("//span[@class='rdrMonthPicker']/select");
	By yearDropDown = By.xpath("//span[@class='rdrYearPicker']/select");
	String dayInCalendar = "//span[@class='rdrDayNumber']/span[text()='Replace']";
	//By totalNoofUsers=By.xpath("(//p[@class='jss147'])[4]");

	public void selectDateFromCalendar(String day, String month, String year) throws AWTException{

	WebElement calendarElement = driver.findElement(calendarIcon);
	calendarElement.click();
	
	WebElement monthDropDownElement = driver.findElement(monthDropDown);
	Select monthdd = new Select(monthDropDownElement);
	monthdd.selectByVisibleText(month);

	WebElement yearDropDownElement = driver.findElement(yearDropDown);
	Select yeardd = new Select(yearDropDownElement);
	yeardd.selectByVisibleText(year);

	dayInCalendar = dayInCalendar.replace("Replace", day);
	WebElement dayElement = driver.findElement(By.xpath(dayInCalendar));
	dayElement.click();
	//driver.findElement(totalNoofUsers).click();
	//calendarElement.click();
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ESCAPE);
	
	

	}
	public void selectProject(String projectName){
		By projectDropDown = By.xpath("//label[text()='Select Project']//parent::div/div/div/div/div[.='Select...']");
		waitForElement(projectDropDown);
		WebElement projectElement = driver.findElement(projectDropDown);
		projectElement.click();
	
		String xpath = "//*[text()='Replace']";
		xpath = xpath.replace("Replace", projectName);
	
		WebElement projectOption = driver.findElement(By.xpath(xpath));
		projectOption.click();
		}
		
		public void selectName(String person){
		By namesDropDown = By.xpath("//label[text()='Select Name']//parent::div/div/div/div/div[.='Select...']");
		waitForElement(namesDropDown);
		WebElement namesElement = driver.findElement(namesDropDown);
		namesElement.click();
	
		String xpath = "(//*[text()='Replace'])[2]";
		xpath = xpath.replace("Replace", person);
	
		WebElement namesOption = driver.findElement(By.xpath(xpath));
		namesOption.click();
	}
	

}
