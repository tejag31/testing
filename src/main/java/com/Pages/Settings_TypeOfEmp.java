package com.Pages;

import org.openqa.selenium.By;


public class Settings_TypeOfEmp extends Setting {
	
	private By settings = By.xpath("//span[text()='Settings']");
	private By TypeOfEmp = By.xpath("//h5[text()='Type Of Employee']");
	private By empdesig = By.xpath("//input[@placeholder=\"Enter Employee Designation\"]");
	private By department = By.xpath("//input[@placeholder=\"Enter Department\"]");
	private By selecthotel = By.xpath("//select[@class=\"form-select\"]");
	private By submit = By.xpath("//button[@type=\"submit\"]");
	private By clear = By.xpath("//b[text()='Clear']");
	private By showentry = By.xpath("//select[@name=\"datatable_length\"]");
	private By search = By.xpath("//input[@type=\"search\"]");
	private By edit=By.xpath("//button[@data-bs-target=\"#editData-1\"]");
	private By delete=By.xpath("//button[@data-bs-target=\"#deleteData-1\"]");
	
	
	
	
	
	
	

	public void settings() {
		clickElement(settings);

	}

	public void typeofemp() {
		clickElement(TypeOfEmp);
	}

	public void empDes(String value) {
		enterText(empdesig, value);
	}

	public void depart(String value) {
		enterText(department, value);
	}

	public void selHotel(int index) {
		dropDownSelectIndex(selecthotel, index);
	}

	public void submit() {
		clickElement(submit);
	}

	public void clear() {
		clickElement(clear);
	}

	public void showEntry(int index) {
		dropDownSelectIndex(showentry, index);
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
