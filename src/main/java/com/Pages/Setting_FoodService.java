package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class Setting_FoodService extends Setting {
    
	 private By setting =By.xpath("//span[text()='Settings']");
     private By service =By.xpath("//h5[text()='Services']");
     private By addservice=By.xpath("//input[@name=\"Service\"]");
     private By serviceimage=By.xpath("//input[@id='image']");
     private By submit =By.xpath("//button[@type=\"submit\"]");
     private By clear =By.xpath("//b[text()='Clear']");
     private By showentries =By.xpath("//select[@name=\"datatable_length\"]");
     private By search =By.xpath("//input[@type=\"search\"]");
     private By edit =By.xpath("//button[@data-bs-target='#editData-7']");
     private By delete =By.xpath("//button[@data-bs-target='#deleteData-1']");

     
     
     
     
     public void setting() {
    	 clickElement(setting);
     }
     public void service() {
    	 clickElement(service);
     }
     public void foodService(String value) {
    	 enterText(addservice, value);
     }
     public void serviceImage(String path) {
    	 enterText(serviceimage, path);
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
