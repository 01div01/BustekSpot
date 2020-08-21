package com.softsuave.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.softsuave.bustle.BaseClass;


public class ListenerTest extends BaseClass implements ITestListener{

	
	@Override
	public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("The name of the testcase failed is :"+result.getName());
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
	  LocalDateTime now = LocalDateTime.now();  
	  String timeStamp = dtf.format(now);
	try {
	takeSnapShot("C:\\Users\\Softsuave\\Pictures\\Saved Pictures\\"+result.getName()+timeStamp+".png");
	} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
	}
	
	@Override
	public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
	}
	
	@Override
	public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
	}

}