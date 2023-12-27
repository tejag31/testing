package com.Execution;

import org.testng.annotations.Test;

import com.Pages.Settings_TypeOfEmp;

public class Setting_TypeOfEmpTest extends Settings_TypeOfEmp {
	@Test
  public void emp() {
		settingTab();
	  typeofemp();
	  empDes("manager");
	  depart("Maintenance");
	  selHotel(2);
	  submit();
	  search("abcd");
	  
  }
}
