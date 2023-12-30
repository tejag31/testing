package com.Pages;

import org.openqa.selenium.By;

public class Setting_TypeOfRooms extends Setting {

	// Room_types
	private By typesofrooms = By.xpath("//h5[text()='Types Of Room']");
	private By roomtype = By.xpath("//input[@placeholder='Enter Room Type']");
	private By No_of_beds = By.xpath("//input[@placeholder='Enter Number Of Beds']");
	private By No_of_rooms = By.xpath("//input[@placeholder='Enter Number Of Rooms']");
	private By submit_rooms = By.xpath("//span[text()='Clear']/../preceding-sibling::button/span[text()='Submit']");
	private By clear_rooms = By.xpath("//span[text()='Clear']");
	// Search
	private By searchtext = By.xpath("//input[@type='search']");
	private By filterrecords = By.xpath("//tbody//tr");
	// table entries
	private By tableentries = By.xpath("//select[@name='datatable_length']");
	// Tables
	private By tablecolumn = By.xpath("//thead/tr/th");
	private By tablerow = By.xpath("//tbody/tr");
	// Actions update
	private By update_noofcots = By.xpath("//div[@id='editData-1']//input[@id='no_cots']");
	
	 
	private By update_cancel = By.xpath("//div[@id='editData-1']//button[contains(text(),'Cancel')]");
	
	public void typesOfRooms() {
		clickElement(typesofrooms);
	}
	public void roomType(String value) {
		enterText(roomtype, value);
	}
	public void noOfBeds(String value) {
		enterText(No_of_beds, value);
	}
	public void noOfRooms(String value) {
		enterText(No_of_rooms, value);
	}
	public void submitRooms() {
		clickElement(submit_rooms);
	}
	public void searchText(String value) {
		enterText(searchtext, value);
	}
	public void showEntries(int index) {
		dropDownSelectIndex(tableentries, index);
	}
	
     public void updateNoOfCots(String noofcots) {
		enterText(update_noofcots, noofcots);
	}
     public void updateNoOfRooms(String noofrooms,int row) {
     By update_noofrooms = By.xpath("//div[@id='editData-"+row+"']//input[@id='no_rooms']");
 	 enterText(update_noofrooms, noofrooms);
 	}
     
     public void cancelUpdated() {
    	 clickElement(update_cancel);
 	}
     
     public int tableFetch(String col,String row) throws InterruptedException {
		
    	   return tableInfo(col,row);
	}
    
    
	
}
