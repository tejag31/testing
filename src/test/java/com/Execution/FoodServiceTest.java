package com.Execution;

import org.testng.annotations.Test;

import com.Pages.FoodService;

public class FoodServiceTest extends FoodService {
@Test
public void food() {
	foodService();
	recipeName("Dosa");
	recipeImage("C:\\Users\\hp\\Pictures\\Screenshots\\Screenshot 2023-11-09 195806.png");
	recipecategory();
	mealType();
	foodCategory();
	price("100");
	recipeDescription("Masala Dosa");
	fSubmit();
	ScrollPage(400,400);
	edit();
	
}
}
