package com.Execution;

import org.testng.annotations.Test;

import com.Pages.ManageUser;

public class ManageUsersTest extends  ManageUser{
	@Test
	
		public void adduser() throws Exception {
		manageUsers();
		alertAccept();
		fullName("Keshav");
		phoneNumber("9553965026");
		idproof("C:\\Users\\DELL\\Pictures\\Screenshots\\kesav.png");
		age("22");
		gender("Male");
		age1("23");
		idProof1("C:\\Users\\DELL\\Pictures\\Screenshots\\kesav.png");
		guests("5");
		submit();
		Search("Keshav");
		ScrollPage(0, 300);
		Thread.sleep(2000);
		EditButton();
		Thread.sleep(2000);
		UpdateGender("Female");
	}}
	
		
	


