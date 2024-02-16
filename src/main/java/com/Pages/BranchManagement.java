package com.Pages;

import org.openqa.selenium.By;
import com.Base.Browser;

public class BranchManagement extends Browser{

	 private By branchmanagement=By.xpath("//span[text()='Branch Management']");
	 private By hotelname=By.xpath("//input[@placeholder='Enter Hotel Name']");
     private By branchimages=By.xpath("//input[@type='file']");
     private By roomnumber=By.xpath("//input[@placeholder='Enter Room Number']");
     private By contact=By.xpath("//input[@placeholder='Enter Your mobile Number']");
     private By mailid=By.xpath("//input[@placeholder='Enter Your Mail-id']");
     private By country=By.xpath("//input[@name='country']");
     private By state=By.xpath("//input[@name='state']");
     private By city=By.xpath("//input[@name='city']");
     private By pincode=By.xpath("//input[@name='pincode']");
     private By address=By.xpath("//textarea[@id='address']");
     private By submit=By.xpath("//h4[text()=' Add Branches']/../../..//span[text()='Submit']");
     //private By clear=By.xpath("//button[@type='reset']");
     //Edit the page 
     private By search=By.xpath("//body[@class='light theme-color-default']//input[@type='search']");
     private By editbutton=By.xpath("//button[@data-bs-target='#editData-1']");
     public void branchManagement() {
    	 
    	clickElement(branchmanagement);
     }
     public void hotelName(String value) {
    	 enterText(hotelname,value);
     }
     public void branchImages(String path) {
    	 enterText(branchimages, path);
     }
     public void roomNumber(String value) {
    	 enterText(roomnumber,value);
     }
     public void contact(String value) {
    	 enterText(contact,value);
     }
     public void mailId(String value) {
    	 enterText(mailid,value);
     }
     public void country(String value) {
    	 enterText(country,value);
     }
     public void state(String value) {
    	 enterText(state,value);
     }
     public void city(String value) {
    	 enterText(city,value);
     }
     public void pincode(String value) {
    	 enterText(pincode,value);
     }
     public void address (String value) {
    	 enterText(address,value);
     
     }
     public void Submit() {
    	 clickElement(submit);
     }
     public void Search(String value) {
    	 enterText(search,value);
     }
     public void EditButton() {
    	 clickElement(editbutton);
    	 System.out.println();
     }
    
     }
     
     
    	 
    
     
     
    		 

