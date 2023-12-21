package com.Execution;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Common.ExtentReport;
import com.Pages.SettingPage;
import com.aventstack.extentreports.ExtentTest;

public class SettingPageTest extends SettingPage {
    @BeforeClass
	public void name() {
		
	}
	
	@Test
	public void settingTest() throws InterruptedException {
		settingTab();
		typesOfRooms();
		roomType("ABCSingle");
		noOfBeds("5");
		noOfRooms("2");
		submitRooms();
		
	}
	@Test(dependsOnMethods = "settingTest")
	public void searchTest() throws InterruptedException {
		Thread.sleep(3000);
		//searchText("ABCSingle");
		Scroll_dwn(200);
	    Thread.sleep(3000);
		editActions();
		Thread.sleep(3000);
		updateNoOfRooms("12");
		updateNoOfCots("13");
		submitUpdated();
		
	}
	 @AfterClass
		public void name1() {
			//driver.quit();
		}
	
}

