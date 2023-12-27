package com.Execution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Pages.Setting_TypeOfRooms;


public class Setting_TypeOfRoomsTest extends Setting_TypeOfRooms {
	@BeforeClass
	public void name() {

	}

	@Test
	public void settingTest() throws InterruptedException, IOException {
		settingTab();
		typesOfRooms();
		roomType("ABCSsingle");
		noOfBeds("5");
		noOfRooms("2");
		submitRooms();

	}

	@Test(dependsOnMethods = "settingTest")
	public void searchTest() throws InterruptedException {
		Thread.sleep(3000);
     	int row=tableFetch("Room Type","ABCSsingle");
     	Thread.sleep(3000);
     	DeleteActions(row);
	}

	@AfterClass
	public void name1() {
		// driver.quit();
	}

}
