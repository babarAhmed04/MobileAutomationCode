package com.appium.screens;

import org.openqa.selenium.WebElement;
import com.appium.base.ScreenBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends ScreenBase {

	// public static AndroidDriver driver;
	//
	public HomeScreen(AndroidDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "io.selendroid.testapp:id/my_text_field")
	public WebElement textField;

	@AndroidFindBy(id = "io.selendroid.testapp:id/visibleButtonTest")
	public WebElement displayBtn;

	@AndroidFindBy(id = "io.selendroid.testapp:id/visibleTextView")
	public WebElement textView;

	@AndroidFindBy(id = "io.selendroid.testapp:id/buttonStartWebview")
	public WebElement webViewBtn;

	@AndroidFindBy(id = "io.selendroid.testapp:id/startUserRegistration")
	public WebElement userRegBtn;

	@AndroidFindBy(id = "io.selendroid.testapp:id/waitingButtonTest")
	public WebElement progressBtn;

	@AndroidFindBy(id = "android:id/progress")
	public WebElement progressBar;

	@AndroidFindBy(id = "android:id/message")
	public WebElement progressText;

	@AndroidFindBy(id = "io.selendroid.testapp:id/showToastButton")
	public WebElement toastBtn;

	@AndroidFindBy(id = "io.selendroid.testapp:id/showPopupWindowButton")
	public WebElement popBtn;

	@AndroidFindBy(id = "io.selendroid.testapp:id/showPopupWindowButton")
	public WebElement popWindow;

	public HomeScreen verifyTextBox(String data) {

		textField.sendKeys(data);
		return this;

	}

	public WebViewScreen verifyWebview() {

		webViewBtn.click();
		return new WebViewScreen(driver);

	}

	public HomeScreen verifyProgressBar() {

		progressBtn.click();
		// to add assertion for the progress bar to be displayed
		return this;

	}

	public HomeScreen verifyTextView() {

		textView.click();
		// to add assertion
		return this;
	}

	public HomeScreen verifyToast() {

		toastBtn.click();
		// to add assertion
		return this;
	}

	public HomeScreen verifyPopup() {

		popBtn.click();
		// to add assertion
		return this;
	}

}
