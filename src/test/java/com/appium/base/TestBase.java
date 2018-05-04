package com.appium.base;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.appium.screens.HomeScreen;
import com.appium.screens.WebViewScreen;
import com.appium.utils.CommonUtils;

import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	
	public static AndroidDriver driver;
	public HomeScreen homescreen;
	public WebViewScreen webview;
	
	
	
	@BeforeSuite
	public void setup() throws IOException{
		
		if(driver==null){
			
			CommonUtils.loadConfigProperties("selendroidtestapp.properties");
			CommonUtils.setCapabilities();
			driver = CommonUtils.getDriver();
		}
	}
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}

}
