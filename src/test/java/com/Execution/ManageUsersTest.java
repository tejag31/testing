package com.Execution;

import org.testng.annotations.Test;

import com.Pages.ManageUser;

public class ManageUsersTest extends  ManageUser{
	@Test
	
		public void adduser() {
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
	}}
	
		
	


