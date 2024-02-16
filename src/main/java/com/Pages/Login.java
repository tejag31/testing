package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class Login extends Browser {

	
	private By username=By.xpath("//input[@placeholder=' User Name']");
	private By password=By.xpath("//input[@placeholder='Password']");
	private By login=By.xpath("//button[contains(text(),'Login')]");
	
	
	

	
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
