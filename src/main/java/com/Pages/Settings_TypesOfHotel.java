package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class Settings_TypesOfHotel extends Browser {

	    //Hotel_types
		private By typesofhotels = By.xpath("//h5[text()='Types Of Hotel']");
		private By hoteltype=By.xpath("//select[@id='hotel_type']");
		private By hotelimage=By.xpath("//input[@placeholder='Enter Hotel Images']");
		private By roomavailability=By.xpath("//h4[contains(text(),'Add Ho')] /../../..//input[@id='availability']");
		private By conatctdetails=By.xpath("//h4[contains(text(),'Add Ho')] /../../..//input[@id='contact']");
		private By hotellocation=By.xpath("//h4[contains(text(),'Add Ho')] /../../..//input[@id='location']");
		private By hotelamenitiesandfacilities=By.xpath("//h4[contains(text(),'Add Ho')] /../../..//input[@id='amenities']");
		private By acceptpolicies=By.xpath("//b[text()='Accept Policies and Rules:']");
		private By submithotels=By.xpath("//h4[contains(text(),'Add Ho')] /../../..//span[text()='Submit']");
		
		
		//methods
		public void hotelType() {
			dropDownSelectIndex(hoteltype, 2);
		}
		public void hotelImage() {
			enterText(hotelimage, "path");
		}
		public void roomAvilability() {
			enterText(roomavailability, "75413");
		}
		public void conatctdDetails() {
			enterText(conatctdetails, "kjsbdna");
		}
		public void hotelLocation() {
			enterText(hotellocation, "hyd");
		}
		public void hotelAmenitiesAndFacilities() {
			enterText(hotelamenitiesandfacilities, "pool");
		}
		public void acceptPolicies() {
			clickElement(acceptpolicies);
		}	
}
