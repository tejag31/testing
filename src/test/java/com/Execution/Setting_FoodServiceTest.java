package com.Execution;

import org.testng.annotations.Test;

import com.Pages.Setting_FoodService;

public class Setting_FoodServiceTest extends Setting_FoodService{
@Test	
public void food() {
	setting();
	service();
	foodService("Food");
    serviceImage("C:\\Users\\hp\\Pictures\\Screenshots\\Screenshot 2023-11-09 194042.png");	
	submit();
	
}
}
