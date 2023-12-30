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
	public void deleting() throws InterruptedException {
		
		
		
		
}}
