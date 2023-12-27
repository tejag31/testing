package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class FoodService extends Browser {
	private By foodservice = By.xpath("//span[text()='Food Service']");
	private By recipename = By.xpath("//input[@placeholder='Enter Recipe Name']");
	private By recipeimage=By.xpath("//input[@id='Recepie_image']");
	private By mealtype = By.xpath("//div[@class='card-body']//select[@id='meal_type']");
	private By price = By.xpath("//input[@placeholder='Enter The Price']");
	private By foodcategory=By.xpath("//select[@id=\"Food_category\"]");
	private By recipecategory=By.xpath("//select[@id=\"Recepie_Category\"]");
	private By recipedescrip = By.xpath("//textarea[@placeholder='Enter The Recipe Descrption']");
	private By fsubmit = By.xpath("//strong[text()='Submit']");
	private By fclear = By.xpath("//b[text()='Clear']");
	private By fsearch = By.xpath("//input[@type=\"search\"]");
	private By showentries = By.xpath("//select[@name='datatable_length']");
	int row=2;
	private By edits=By.xpath("//button[@data-bs-target=\"#editData-"+row+"\"]");
	
	private By delete=By.xpath("//button[@data-bs-target='#deleteData-1']");


	public void foodService() {
		clickElement(foodservice);
	}

	public void recipeName(String value) {
		enterText(recipename, value);
	}
    public void recipeImage(String path) {
    	enterText(recipeimage, path);
    }
	public void mealType() {
		dropDownSelectIndex(mealtype, 1);
	}

	public void price(String value) {
		enterText(price, value);
	}

	public void recipeDescription(String value) {
		enterText(recipedescrip, value);
	}
	public void foodCategory() {
		dropDownSelectIndex(foodcategory, 1);
	}
	public void recipecategory() {
		dropDownSelectIndex(recipecategory, 1);
	}
	

	public void fSubmit() {
		clickElement(fsubmit);
	}

	public void fClear() {
		clickElement(fclear);
	}

	public void fSearch() {
		clickElement(fsearch);
	}

	public void showEntries() {
		clickElement(showentries);
	}
	public void edit() {
		clickElement(edits);
	}
	public void delete() {
		clickElement(delete);
	}
}
