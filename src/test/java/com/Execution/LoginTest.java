package com.Execution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.Browser;
import com.Pages.Login;

public class LoginTest extends Login {
	Browser bro = new Browser();

	@BeforeClass
	public void launchURL() throws Exception {
		driver = bro.lunchUrl();

	}

	@Test
	public void logging() { 
		userName("hotel");
		passWord("hotel@123");
		logIn();
	}

	@AfterClass
	public void name() {

	}
}
