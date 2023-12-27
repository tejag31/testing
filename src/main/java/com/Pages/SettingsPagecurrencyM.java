package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class SettingsPagecurrencyM extends Setting {
	
	private By clickcurrancy = By.xpath("//h5[text()='Currency']");
	private By addcurrancy = By.xpath("//input[@placeholder='Enter Currency']");
	private By submite = By.xpath("//span[text()='Submit']");
	private By search = By.xpath("//input[@type='search']");
	private By aditbutton = By.xpath("//button[@data-bs-toggle='modal']/..//child::button[@class='btn btn-outline-dark text-white']");
	private By aditcurrancy = By.xpath("//input[@value='fifty nine rupees']");
	private By updatesubmit = By.xpath("//div[@id='editData-1']//span[text()='Submit']");
	private By clickondeletebutton = By.xpath("//button[@data-bs-target='#deleteData-1']");
	private By deletetect = By.xpath("//div[@class='modal fade show'] //a[text()='Delete']");

	public void clickSettings() {
		clickElement(Setting_tab);
	}

	public void clickCurrancy() {
		clickElement(clickcurrancy);
	}

	public void addCurrancy(String value) {
		enterText(addcurrancy, value);
	}

	public void submit() {
		clickElement(submite);
	}

	public void search(String value) {
		enterText(search, value);

	}

	public void editButton() {
		clickElement(aditbutton);
	}

	public void aditCurrancy(String value) {
		enterText(aditcurrancy, value);
	}

	public void updateSubmit() {
		clickElement(updatesubmit);
	}

	public void clickdelet() {
		clickElement(clickondeletebutton);
	}

	public void deletTheText() {
		clickElement(deletetect);
	}

}