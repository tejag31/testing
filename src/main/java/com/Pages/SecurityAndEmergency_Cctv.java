package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class SecurityAndEmergency_Cctv extends Browser {
	private By secser = By.xpath("//span[text()='Security  and Emergency ']");
	private By cctv = By.xpath("//h5[text()='CCTV Surveillance']");
	private By branchname = By.xpath("//select[@id=\"city\"]");
	private By noofcctv = By.xpath("//input[@placeholder=\"Enter Number Of cctv\"]");
	private By descr = By.xpath("//input[@placeholder=\"Enter The Description\"]");
	private By submit = By.xpath("//form[@method='post']//span[text()='Submit']");

	private By clear = By.xpath("//form[@method='post']//span[text()='Clear']");
	private By showentries = By.xpath("//select[@name=\"datatable_length\"]");
	private By search = By.xpath("//input[@type=\"search\"]");
	private By edit = By.xpath("//button[@data-bs-target=\"#editData-1\"]");
	// edit
	private By des = By.xpath("//input[@value=\"good\"]");
	private By sub = By.xpath("//div[@id=\"editData-1\"]//span[text()='Submit']");

	private By delete = By.xpath("//input[@type=\"search\"]");

	public void secSer() {
		clickElement(secser);
	}

	public void cctv() {
		clickElement(cctv);
	}

	public void branchName(int index) {

		dropDownSelectIndex(branchname, index);
	}

	public void noOfCctv(String value) {
		enterText(noofcctv, value);
	}

	public void description(String value) {
		enterText(descr, value);
	}

	public void submit() {
		clickElement(submit);
	}

	public void clear() {
		clickElement(clear);
	}

	public void showEntries() {
		clickElement(showentries);

	}

	public void search(String value) {
		enterText(search, value);
	}

	public void edit() {
		clickElement(edit);
	}

	public void des(String value) {
		enterText(des, value);
	}

	public void sub() {
		clickElement(sub);
	}
}
