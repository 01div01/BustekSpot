package com.softsuave.bustle;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	@BeforeClass
	public void driverInitialization() throws IOException{
	initilization();
	}

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	

	public static void initilization() throws IOException{
		prop=new Properties();
		fis=new FileInputStream("C:\\Users\\Softsuave\\Desktop\\BustelSpot\\BustleMaven\\src\\test\\java\\com\\softsuave\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
	
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();	
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	
	public void waitForElement(By locator){
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement returnWebElement(By locator){
	WebElement ele = driver.findElement(locator);
	return ele;
	}
	

}
