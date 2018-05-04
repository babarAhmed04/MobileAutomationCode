package com.appium.testcases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.base.TestBase;
import com.appium.screens.HomeScreen;



public class HomeScreenElementsValidation extends TestBase {

	
	
	@Test
	public void verifyWebViewbutton(){
		
		homescreen = new HomeScreen(driver);
		homescreen.verifyTextView();
		Assert.assertSame(driver, webview);
	}
	
	@Test
	public void verifyTextBox(){
		
		homescreen = new HomeScreen(driver);
		homescreen.verifyTextBox("Appium Test");
	}
	
	@Test
	public void verifyProgressBar(){
		
		homescreen = new HomeScreen(driver);
		homescreen.verifyProgressBar();
		Assert.assertEquals((homescreen.progressText.getText()), "Waiting Dialog");
			
	}
	
	@Test
	public void verifyTextView(){
		
		homescreen = new HomeScreen(driver);
		homescreen.verifyTextView();
		Assert.assertEquals(homescreen.textView.getText(), "Text is sometimes displayed");
	}
	
	
}
