package com.Execution;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Pages.Setting_TypeOfRooms;

public class Setting_TypeOfRoomsTest extends Setting_TypeOfRooms {
	
	@BeforeMethod
	public void main() {
		settingTab();
		typesOfRooms();	
	}
    
	@Test
	public void addRoomDetails() {
		roomType("Triple");
		noOfBeds("4");
		noOfRooms("4");
		submitRooms();
	}
	
	@Test
	public void editRoom() throws InterruptedException {
		int row = tableInfo("Room Type", "Triple");
		Thread.sleep(3000);
		editActions(row);
		Thread.sleep(3000);
		updateNoOfRooms("10",row);
		submitUpdated(row);
	}
	@Test
	public void deleteRoom() throws InterruptedException {
		int row = tableInfo("Room Type", "Triple");
		Thread.sleep(3000);
		DeleteActions(row);
		Thread.sleep(3000);
		removeRecord(row);
	}
	@Test
	public void roomTypeStatus() throws InterruptedException {
		roomType("deluxe");
		noOfBeds("2");
		noOfRooms("4");
		submitRooms();
		int row=tableInfo("Room Type","deluxe");
		Thread.sleep(3000);
		UpdateStatus(row);
		
	}
	@Test
	public void searchData() throws InterruptedException {
		
		searchRecords("delu");
		int row=tableInfo("Room Type","deluxe");
		Thread.sleep(3000);
		String roomtype=searcfunc(row,"deluxe");
		Thread.sleep(3000);
		assertEquals(roomtype, "deluxe","your searching roomtype is not avilabe");  
	}
	
	public void name() {
		
	}
	
	@BeforeMethod
	public void beforeMethods() {
		
	}
}
