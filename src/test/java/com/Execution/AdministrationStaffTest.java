package com.Execution;

import org.testng.annotations.Test;

import com.Pages.AdministrationStaff;

public class AdministrationStaffTest extends AdministrationStaff  {
	@Test
	public void exicute() throws Exception {
		admistationStaf();
		enterName("Akula pavan");
		Gender();
		mobileNumber("8500188542");
		pincode("506344");
		branchLocation();
		uploadPaport("C:\\Users\\saisu\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-07-31 151315.png");
		signatureConsent("C:\\Users\\pavan\\OneDrive\\Pictures\\Screenshots/Screenshot 2023-11-02 152303.png");
		dateOfBirth("28/12/2023");
		employeeAdress("1/84Abc");
		AlternetiveMobileNum("9550026244");
		Department();
		ShiftTiming();
		applicableIdProff("C:\\Users\\pavan\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-02 145421.png");
		Employee("23");
		Nationality();
		EmailId("pavanchikku5544@gmail.com");
		Designation();
		TypeOfEmployee();
		Uploadallnecessary("C:\\Users\\pavan\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-20 202330.png");
		termsAndComditions();
		Thread.sleep(6000);
		submit();
		ScrollPage(400, 400);
		
		
		
	
	}

}
