package com.Execution;

import org.testng.annotations.Test;

import com.Pages.Logout;

public class LogoutTest extends Logout{
    @Test
	public void logOutTest() {
		logOut();
	}
}
