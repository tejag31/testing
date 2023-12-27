package com.Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Pages.BranchManagement;

public class BranchManagementTest extends  BranchManagement{
   @Test
	   
   public void Addbranches(){
	   branchManagement();
	   alertAccept();
	   hotelName("Rajhotel");
	   branchImages("C:\\Users\\DELL\\Pictures\\Screenshots\\kesav.png");
	   roomNumber("3");
	   contact("9553965026");
	   mailId("shalivahana.keshav@gmail.com");
	   country("india");
	   state("Telangana");
	   city("hyderabad");
	   pincode("500081");
	   address("madhapur");
	   submit();
	   //clear();
	   
	   
	   
   }
}
