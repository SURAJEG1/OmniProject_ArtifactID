package com.Amazon.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + "  :Successfully Executed...");
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + "  :Got failed & Screenshot Captured...");
	}

	
	

}
