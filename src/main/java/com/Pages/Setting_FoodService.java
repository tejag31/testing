package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class Setting_FoodService extends Setting {
    
     private By service =By.xpath("//h5[text()='Services']");
     private By addservice=By.xpath("//input[@placeholder=\"Enter Service\"]");
     private By submit =By.xpath("//b[text()='Submit']");
     private By clear =By.xpath("//b[text()='Clear']");
     private By showentries =By.xpath("//select[@name=\"datatable_length\"]");
     private By search =By.xpath("//input[@type=\"search\"]");
     private By edit =By.xpath("//button[@data-bs-target='#editData-7']");
     private By delete =By.xpath("//button[@data-bs-target='#deleteData-1']");

     public void service() {
    	 clickElement(service);
     }
     public void foodService(String value) {
    	 enterText(addservice, value);
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
     public void search() {
    	 clickElement(search);
     }
     public void edit() {
    	 clickElement(edit);
     }
     public void delete() {
    	 clickElement(delete);
     }
}
