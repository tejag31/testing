package com.Pages;

import org.openqa.selenium.By;

import com.Base.Browser;

public class AdministrationStaff extends Browser{
private By admistrationstaff=By.xpath("//span[contains(text(),'Administration Staff')]");
private By enterfullname=By.xpath("//input[@oninput='validateFullName(this)']");
private By selectgender=By.xpath("//select[@id='gender']");
private By mobilenumber=By.xpath("//input[@placeholder='Enter Mobile Number']");
private By pincode=By.xpath("//input[@placeholder='Enter Pin Code']");
private By branchlocation=By.xpath("//select[@id='branch_location']");
private By uploadpassport=By.xpath("//input[@id='passport_image']");
private By signature=By.xpath("//main[@class='main-content']//b[contains(text(),'Signature')]/../following-sibling::input");
private By dateofbirth=By.xpath("//input[@onchange='validateDate()']");
private By employeeaddress=By.xpath("//input[@id='emp_address']");
private By alternative=By.xpath("//input[@placeholder='Enter Alternate Mobile Number']");
private By department=By.xpath("//select[@id='department']");
private By shifttiming=By.xpath("//select[@id='shift_timings']");
private By uploadallidproff=By.xpath("//input[@id='id_prooof']");
private By employeeage=By.xpath("//input[@placeholder='Enter Employee Age']");
private By nationalityofemployee=By.xpath("//select[@id='nationality']");//genric method
private By empid=By.xpath("//input[@placeholder='Email-id']");
private By Designation=By.xpath("//select[@id='designation']");
private By typesofemploye=By.xpath("//select[@id='type_of_emp']");
private By uploadallnecessary=By.xpath("//input[@id='certificates']");
private By tearmsandconditions=By.xpath("//b[text()='terms and conditions']");
private By submit=By.xpath("//span[text()='Submit']");


  
  public void admistationStaf() {
	  clickElement(admistrationstaff);
  }
  public void enterName(String value) {
	  
	  enterText(enterfullname,value);  
  }
  public void Gender() {
	  dropDownSelectText(selectgender,"Male");
	  
  }
  public void mobileNumber(String value) {
	  enterText(mobilenumber, value);
	  
}
public void pincode(String value) {
	  enterText(pincode, value);
  }
  public void branchLocation() {
	  
	 dropDownSelectText(branchlocation, "Hyderabad") ;
	   
  }
  public void uploadPaport(String path) {
	  enterText(uploadpassport, path);
  }
  public void signatureConsent(String path) {//path
	  enterText(signature, path);  
  }
  public void dateOfBirth(String value) {
	  enterText(dateofbirth,value);
	  
  }
  public void employeeAdress(String value) {
	  enterText( employeeaddress, value);
	    
  }
  public void AlternetiveMobileNum(String value) {
	  enterText(alternative, value);
  }
  public void Department() {
	  dropDownSelectIndex(department, 2);
	  
  }
  public void ShiftTiming() {
	  dropDownSelectIndex(shifttiming, 1);
	  
  }
  public void applicableIdProff(String path) {//path
	  enterText(uploadallidproff, path);
	    
  }
 public void Employee(String value) {
	 
	 enterText(employeeage, value);
 }
  public void Nationality() {
	  dropDownSelectIndex(nationalityofemployee, 2);
	  
  }
  public void EmailId(String value) {
	  enterText(empid, value);
	  
  }
  public void Designation() {
	  dropDownSelectIndex(Designation, 2);
	  
  }
  public void TypeOfEmployee() {
	  dropDownSelectIndex(typesofemploye, 3);
  }
  public void Uploadallnecessary(String value) {
	  enterText(uploadallnecessary,value);
	  
  }
  public void termsAndComditions() {
	  clickElement(tearmsandconditions);
	  
  }
  public void submit() {
	  clickElement(submit);
  }
  

}
