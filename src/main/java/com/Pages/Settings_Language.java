package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class Settings_Language extends Setting {
	
	private By language=By.xpath("//h5[text()='Language']");
	private By addlanguage=By.xpath("//input[@id='Language']");
    private By submit=By.xpath("//button[@type='submit']");
    private By searchText=By.xpath("//input[@type='search']");
    
    //editpage 
    String lang;
    private By edit=By.xpath("//div[@class='card-body']//button[@class='btn ']"); 
   // private By editbutton=By.xpath("//div[@class='card-body']//button[@class='btn ']");)
    private By editlanguage=By.xpath("//div[@id='editData-1']//input[@id='Language']");
    private By submit1=By.xpath("//div[@id='editData-1']//button[@class='btn mt-2']");
    
    
    public void Language() {
    	clickElement(language);
    }
    public void AddLanguage(String value ) {
    	enterText(addlanguage, value);
    }
    public void Submit() {
    	clickElement(submit);
    }
    public void SearchText(String value) {
    	enterText(searchText,value);
    }
    public void Edit() {
    	clickElement(edit);
    }
    public void EditLanguage(String value) {
    	enterText(editlanguage, value);
    }
    public void Submit1() {
    	clickElement(submit1);
    }
    
}
