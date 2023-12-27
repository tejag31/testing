package com.Execution;

import org.testng.annotations.Test;

import com.Pages.SettingsPagecurrencyM;

public class SettingsPageCurrencyModuleTest extends SettingsPagecurrencyM {

	@Test
	public void excute() throws InterruptedException {
		Thread.sleep(1000);
		clickSettings();
		clickCurrancy();
		addCurrancy("fifty nine rupees");
		submit();
		// search("fifty nine rupees");
		editButton();
		aditCurrancy("twenty nine rupees");
		Thread.sleep(3000);
		updateSubmit();
		clickdelet();
		Thread.sleep(3000);
		deletTheText();

	}

}
