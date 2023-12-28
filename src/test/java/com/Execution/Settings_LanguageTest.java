package com.Execution;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Pages.Settings_Language;

public class Settings_LanguageTest extends Settings_Language {
	
	@Test
	public void languageTest() {
	
	Settings();
	Language();
	AddLanguage("english");
	Submit();
	}
	@Test
	public void searchTest() throws InterruptedException {
		
		SearchText("english");
		Thread.sleep(3000);
		ScrollPage(0, 300);
		//Thread.sleep(2000);
		Edit();
		Thread.sleep(2000);
		EditLanguage("English");
		Thread.sleep(2000);
		Submit1();
		
		
}}
