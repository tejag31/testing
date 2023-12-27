package com.Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.Base.Browser;

public class Setting extends Browser {

	// settings tab
	 By Setting_tab = By.xpath("//span[text()='Settings']");

	// methods
	public void settingTab() {
		clickElement(Setting_tab);
	}

}
