package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class SecurityAndEmergency_FireSafety extends Browser {
	private By secser = By.xpath("//span[text()='Security  and Emergency ']");
	private By firesafety = By.xpath("//h5[text()='Fire and safety drills']");
	private By branchname = By.xpath("//select[@id=\"city\"]");
	private By noofdrills = By.xpath("//input[@placeholder=\"Enter Number Of Drills\"]");
	private By description = By.xpath("//input[@placeholder=\"Enter The Description\"]");
	private By submit = By.xpath("//div[@class=\"col-xl-12\"]//span[text()='Submit']");
	private By clear = By.xpath("//div[@class=\"col-xl-12\"]//span[text()='Clear']");
	private By showentries = By.xpath("//select[@name=\"datatable_length\"]");
	private By search= By.xpath("//input[@type=\"search\"]");
	private By edit= By.xpath("//button[@data-bs-target=\"#editData-1\"]");
	private By delete= By.xpath("//button[@data-bs-target=\"#deleteData-1\"]");

	

	
	
	//input[@type="search"]

	public void secser() {
		clickElement(secser);
	}

	public void fireSafety() {
		clickElement(firesafety);
	}

	public void branchName(int index) {
		dropDownSelectIndex(branchname, index);
	}

	public void noOfDrills(String value) {
		enterText(noofdrills, value);
	}

	public void descript(String value) {
		enterText(description, value);
	}

	public void submit() {
		clickElement(submit);
	}

	public void clear() {
		clickElement(clear);
	}
	public void showEntries(int index) {
		dropDownSelectIndex(showentries, index);
	}
	public void search(String value) {
		enterText(search, value);
	}
	public void edit() {
		clickElement(edit);
	}
	public void delete() {
		clickElement(delete);
	}

}
