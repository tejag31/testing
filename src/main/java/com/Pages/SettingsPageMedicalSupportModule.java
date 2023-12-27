package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class SettingsPageMedicalSupportModule extends Browser{
	private By clicksucurityandemergency=By.xpath("//span[text()='Security  and Emergency ']");
	private By clickmedicalsupport=By.xpath("//h5[text()='Medical support']");
	private By branchname=By.xpath("//select[@id='city']");
	private By description=By.xpath("//input[@id='desc_m']");
	private By submite=By.xpath("//span[text()='Submit']");
	private By search=By.xpath("//input[@class='form-control form-control-sm']");
	
	
	public void clickSucurityEmergency() {
	  clickElement(clicksucurityandemergency);
	}
	public void clickMedicalSupport() {
		clickElement(clickmedicalsupport);
	}
	public void branchName() {
		dropDownSelectIndex(branchname, 2);
	}
	public void Description(String value) {
		enterText(description,value);
	}
	public void Submite() {
		clickElement(submite);
		
	}
	public void Search(String value) {
		enterText(search, value);
		
	}

}
