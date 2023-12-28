package com.Execution;

import org.testng.annotations.Test;

import com.Pages.SecurityAndEmergency_FireSafety;

public class SecurityAndEmergency_FireSafetyTest extends SecurityAndEmergency_FireSafety {
	@Test
	public void fireSafetyTest() {
		secser();
     	fireSafety();
		branchName(2);
		noOfDrills("4");
		descript("Good");
		submit();
		showEntries(1);
		search("hyderabad");
		//edit();

	}
}
