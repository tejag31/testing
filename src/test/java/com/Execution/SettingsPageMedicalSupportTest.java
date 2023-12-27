package com.Execution;

import org.testng.annotations.Test;

import com.Pages.SettingsPageMedicalSupportModule;

public class SettingsPageMedicalSupportTest extends SettingsPageMedicalSupportModule {
	@Test
	public void excute() throws InterruptedException {
		//Thread.sleep(6000);
		clickSucurityEmergency();
		clickMedicalSupport();
		branchName();
		Description("cricketers");
		Submite();
		//Search("fifty nine");
		
		
		
	}

}
