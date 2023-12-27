package com.Execution;

import org.testng.annotations.Test;

import com.Pages.Setting_FoodService;

public class Setting_FoodServiceTest extends Setting_FoodService{
@Test	
public void food() {
	settingTab();
	service();
	foodService("clean");
	submit();
	
}
}
