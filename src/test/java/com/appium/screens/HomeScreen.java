package com.appium.screens;

import org.openqa.selenium.WebElement;
import com.appium.base.ScreenBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends ScreenBase {
	
//	public static AndroidDriver driver;
//	
	public HomeScreen(AndroidDriver driver){
		super(driver);
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/my_text_field")
	public WebElement textField;
	 
	
	
	public HomeScreen VerifyTextBox(String data){
		
		textField.sendKeys(data);
		return this;
		
	}

}
