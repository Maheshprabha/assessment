package com.atmecs.openmrs.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.openmrs.constants.Constants;
import com.atmecs.openmrs.readerlocation.PropertyReader;
import com.atmecs.openmrs.report.Reports;

public class Homepage {

	public WebDriver driver;
	Properties property;
	Properties Userdata;
	  Reports log=new Reports();
	public Homepage(WebDriver driver){
		this.driver=driver;
	}
	public void login(String Username, String Password) {
		property=	PropertyReader.readProperties(Constants.Login_Path);
		Userdata=	PropertyReader.readProperties(Constants.User_path);

	    CommonHelpers.sendText(driver, property.getProperty("loc_username"), ("Username"));
	   CommonHelpers.sendText(driver, property.getProperty("loc_password"), ("Password"));
	   CommonHelpers.clickAction(driver, property.getProperty("loc_pharmacy"));
	   CommonHelpers.clickAction(driver, property.getProperty("loc_loginbutton"));
	                                                                                                                                                          CommonHelpers.clickAction(driver, property.getProperty("loc_findpatientrecord"));
		CommonHelpers.sendText(driver, property.getProperty("loc_patientsearch"), Userdata.getProperty("user_id"));
	}
}

	/*	public void login() {
		property = PropertyReader.readProperties(Constants.Registerlocator_Path);
		Userdata = PropertyReader.readProperties(Constants.Registeruserdata_Path);
		log.info("Enter user name");

		CommonHelpers.sendText(driver, property.getProperty("loc_username"), Userdata.getProperty("data_username"));
		log.info("Enter password");
		CommonHelpers.sendText(driver, property.getProperty("loc_password"), Userdata.getProperty("data_password"));
		log.info("Clicking pharmacy");

		CommonHelpers.clickAction(driver, property.getProperty("loc_pharmacy"));
		log.info("Enter loginbutton");

		CommonHelpers.clickAction(driver, property.getProperty("loc_loginbutton"));
		log.info("Clicking loginbutton");
		CommonHelpers.clickAction(driver, property.getProperty("loc_findpatientrecord"));
		CommonHelpers.sendText(driver, property.getProperty("loc_patientsearch"), Userdata.getProperty("user_id"));
*/
		

	


