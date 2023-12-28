package com.Execution;

import org.testng.annotations.Test;

import com.Pages.Settings_TypeOfEmp;

public class Setting_TypeOfEmpTest extends Settings_TypeOfEmp {
	@Test
	public void emp() {
		  settings();
		  typeofemp();
		  empDes("manager");
		  depart("Maintenance");
		  selHotel(3);
		  submit();
		  search("abcd");
		  
	  }
}
