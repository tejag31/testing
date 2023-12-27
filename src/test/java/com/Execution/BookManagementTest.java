package com.Execution;

import org.testng.annotations.Test;

import com.Pages.BookingManagementPage;

public class BookManagementTest extends BookingManagementPage {

	@Test
	public void Book() {
		
		bookManage();
		userName("Sruthi");
		contactNum("9134567789");
		email("reddtyst@gmail.com");
		branch("Banglore");
		roomNo("02");
		noOfAdults("3");
		noOfChildren("5");
		submit();
		search("sruthi");
		edit();
	}
 

	}



