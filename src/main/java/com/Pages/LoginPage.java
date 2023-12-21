package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class LoginPage extends Browser {

	
	private By username=By.xpath("//input[@placeholder='Enter User Name']");
	private By password=By.xpath("//input[@placeholder='Enter Password']");
	private By login=By.xpath("//b[text()='Login']");
	
	public void userName(String value) {
		enterText(username, value);
	}
	public void passWord(String value) {
		enterText(password, value);
	}
	public void logIn() {
		clickElement(login);
	}
	
	
	
}
