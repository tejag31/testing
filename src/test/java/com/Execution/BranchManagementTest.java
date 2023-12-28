package com.Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Pages.BranchManagement;

public class BranchManagementTest extends  BranchManagement{
   @Test
	   
   public void Addbranches() throws Exception{
	   branchManagement();
	   alertAccept();
	   hotelName("Rajshotel");
	   branchImages("C:\\Users\\DELL\\Pictures\\Screenshots\\kesav.png");
	   roomNumber("4");
	   contact("9553965026");
	   mailId("shalivahana.keshav@gmail.com");
	   country("india");
	   state("Telangana");
	   city("hyderabad");
	   pincode("500081");
	   address("madhapur");
	   ScrollPage(0, 100);
	   Submit();
	   alertAccept();
	   ScrollPage(100, 300);
	   //clear();
	   Search("Sruthi");
	   ScrollPage(200, 200);
	   
	  
	   EditButton();
	   
	   
	   
   }
}
