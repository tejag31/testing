package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class BookingManagementPage extends Browser {
	private By BookManage = By.xpath("//span[text()='Booking Management']");
	private By username = By.xpath("//input[@placeholder='Enter User Name']");
	private By contactnum = By.xpath("//b[text()='Contact Number']/../../child::input");
	private By email = By.xpath("//b[text()='Email-id']/../../input");
	private By branch = By.xpath("//select[@name='branch']");
	private By roomno = By.xpath("//b[text()='Room Number']/../../input");
	private By noofadults = By.xpath("//input[@placeholder=\"Enter Number Of Adults\"]");
	private By noofchildren = By.xpath("//input[@placeholder=\"Enter Number Of Children\"]");
	private By submit = By.xpath("//b[text()='Submit']");
	private By clear = By.xpath("//b[text()='Clear']");
	private By search = By.xpath("//input[@type='search']");
	private By edit = By.xpath("//button[@data-bs-target='#editData-7']");
	private By delete = By.xpath("//button[@data-bs-target='#deleteData-1']");
	private By showentries=By.xpath("//select[@name='datatable_length']");
	
	
	
	

	public void bookManage() {
		clickElement(BookManage);
	}

	public void userName(String value) {
		enterText(username, value);
	}

	public void contactNum(String value) {
		enterText(contactnum, value);
	}

	public void email(String value) {
		enterText(email, value);
	}

	public void branch(String value) {
		enterText(branch, value);
	}

	public void roomNo(String value) {
		enterText(roomno, value);
	}

	public void noOfAdults(String value) {
		enterText(noofadults, value);
	}

	public void noOfChildren(String value) {
		enterText(noofchildren, value);
	}

	public void submit() {
		clickElement(submit);
	}

	public void clear() {
		clickElement(clear);
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
	public void showentries() {
		clickElement(showentries);
	}
}
