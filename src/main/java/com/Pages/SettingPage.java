package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class SettingPage extends Browser {
     
	// settings tab
	private By Setting_tab = By.xpath("//span[text()='Settings']");
	// Room_types
	private By typesofrooms = By.xpath("//h5[text()='Types Of Room']");
	private By roomtype = By.xpath("//input[@placeholder='Enter Room Type']");
	private By No_of_beds = By.xpath("//input[@placeholder='Enter Number Of Beds']");
	private By No_of_rooms = By.xpath("//input[@placeholder='Enter Number Of Rooms']");
	private By submit_rooms = By.xpath("//span[text()='Clear']/../preceding-sibling::button/span[text()='Submit']");
	private By clear_rooms = By.xpath("//span[text()='Clear']");
	//Hotel_types
	private By typesofhotels = By.xpath("//h5[text()='Types Of Hotel']");
	private By amenities = By.xpath("//h5[text()='Amenities']");
	private By typeofemployee = By.xpath("//h5[text()='Type Of Employee']");
	private By language = By.xpath("//h5[text()='Language']");
	private By currency = By.xpath("//h5[text()='Currency']");
	private By services = By.xpath("//h5[text()='Services']");
	//Search
	private By searchtext=By.xpath("//input[@type='search']");
	private By filterrecords=By.xpath("//tbody//tr");
	// show entries 
	private By showentries=By.xpath("//select[@name='datatable_length']");
	//Tables
	private By tablecolumn=By.xpath("//thead/tr/th");
	private By tablerow=By.xpath("//tbody/tr//td[@class='name']");
	int row=4;
	String s="//tbody//tr//td[@class='sorting_1' and text()='"+row+"']//following-sibling::td/button[@class='btn']";
	private By editactions=By.xpath(s);
	private By deleteactions=By.xpath("//tbody//tr//td//button[@class='btn btn-danger']");
	//Actions
	private By update_noofcots=By.xpath("//div[@id='editData-"+row+"']//input[@id='no_cots']");
	private By update_noofrooms=By.xpath("//div[@id='editData-"+row+"']//input[@id='no_rooms']");
    private By update_submit=By.xpath("//div[@id='editData-"+row+"']//span[text()='Submit']");
    private By update_cancel=By.xpath("//div[@id='editData-"+row+"']//button[contains(text(),'Cancel')]"); 
	//methods
	public void settingTab() {
		clickElement(Setting_tab);
	}
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
	public void filterRecords() {
		
	}
	public void showEntries(int index) {
		dropDownSelectIndex(showentries, index);
	}
	public void tableRecord() {
		
	}
	public void editActions() {
		clickElement(editactions);
	}
     public void DeleteActions() {
		clickElement(deleteactions);
	}
     public void updateNoOfCots(String noofcots) {
		enterText(update_noofcots, noofcots);
	}
     public void updateNoOfRooms(String noofrooms) {
 		enterText(update_noofrooms, noofrooms);
 	}
     public void submitUpdated() {
		clickElement(update_submit);
	}
     public void cancelUpdated() {
    	 clickElement(update_cancel);
 	}
	

}
