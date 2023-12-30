package com.Execution;

import org.testng.annotations.Test;

import com.Pages.SecurityAndEmergency_Cctv;

public class SecurityAndEmergency_CctvTest extends SecurityAndEmergency_Cctv{
	@Test
   public void SecEmer() {
	   secSer();
	   cctv();
	   branchName(2);
	   noOfCctv("4");
	   description("Ok");
	   submit();
	   showEntries();
	   search("hyderabad");
   }
}
