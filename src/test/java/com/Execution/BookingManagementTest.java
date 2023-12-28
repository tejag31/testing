package com.Execution;

import org.testng.annotations.Test;

import com.Pages.BookingManagement;

public class BookingManagementTest extends BookingManagement {

	@Test
	public void Book() {
		
		bookManage();
		userName("Sruthi");
		contactNum("9134567789");
		email("reddtyst@gmail.com");
		branch(2);
		roomNo("02");
		noOfAdults("3");
		noOfChildren("5");
		submit();
		search("sruthi");
		edit();
	}
 

	}



