package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class Logout extends Browser{

	private By logout=By.xpath("//span[text()='Logout']");
	
	public void logOut() {
		clickElement(logout);
	}
}

