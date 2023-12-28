package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class ManageUser extends Browser {
	private By manageusers = By.xpath("//span[text()='Manage Users']");
	private By fullname =By.xpath("//input[@id='branchName']");
	private By phonenumber=By.xpath("//input[@id='phoneNumber']");
	private By idproof=By.xpath("//label[@for='phoneNumber']/../following-sibling::div/input[@id='formFile']");
    private By age=By.xpath("//input[@id='age']");
    private By gender=By.xpath("//select[@id='gender']");
    private By age1=By.xpath("//div[@class='card-body']//input[@id='age1']"); 
    private By idproof1=By.xpath("//div[@class='card-body']//b[text()='Guest Details:']/..//following-sibling::div//input[@type='file']");
    private By noofguests=By.xpath("//div[@class='card-body']//b[text()='Guest Details:']/..//following-sibling::div//input[@id='numOfGuests']");
    private By submit=By.xpath("//div[@class='card-body']//span[text()='Submit']");
    
    //edit the page 
    private By search=By.xpath("//input[@type='search']");
    private By editbutton=By.xpath("//button[@data-bs-target=\'#editData-3\']");
    private By updategender=By.xpath("//div[@id='editData-3']//select[@id='gender1']");

    public void manageUsers() {
    	clickElement(manageusers);
    	 }
    public void fullName(String value) {
    	enterText(fullname,value);
    }
    public void phoneNumber(String value) {
    	enterText(phonenumber,value);
    }
    public void idproof(String path) {
        enterText(idproof ,path);	
    }
    public void age(String value) {
    	enterText(age,value);
    }
    public void gender(String value) {
    	dropDownSelectText(gender, value);
    }
    public void age1(String value) {
    	enterText(age1,value);
    }
    public void idProof1(String value) {
    	enterText(idproof1, value);	
    }
    public void guests(String value) {
    	enterText(noofguests,value);
    }
    public void submit() {
    	clickElement(submit);
    }
    public void Search(String value) {
    	enterText(search, value);
    }
    public void EditButton() {
    	clickElement(editbutton);
    }
    public void UpdateGender(String value) {
    	enterText(updategender, value);
    }
    }
    