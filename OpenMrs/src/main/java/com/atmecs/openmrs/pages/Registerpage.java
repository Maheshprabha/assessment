package com.atmecs.openmrs.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.openmrs.constants.Constants;
import com.atmecs.openmrs.readerlocation.PropertyReader;
import com.atmecs.openmrs.report.Reports;

public class Registerpage {

	public WebDriver driver;
	Properties property;
	Properties Userdata;

	Reports log = new Reports();

	public Registerpage(WebDriver driver) {
		this.driver = driver;
	}

	public void register() throws Exception {
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

		CommonHelpers.clickAction(driver, property.getProperty("loc_register"));
		log.info("Enter firstname");

		CommonHelpers.sendText(driver, property.getProperty("loc_givenname"), Userdata.getProperty("data_givenname"));
		log.info("Enter familyname");

		CommonHelpers.sendText(driver, property.getProperty("loc_familyname"), Userdata.getProperty("data_familyname"));
		log.info("Enter loginbutton");

		CommonHelpers.clickAction(driver, property.getProperty("loc_button"));
		log.info("Selecting gender");

		CommonHelpers.clickAction(driver, property.getProperty("loc_gender"));
		log.info("Enter loginbutton");

		CommonHelpers.clickAction(driver, property.getProperty("loc_button"));
		log.info("Enter estimation year");

		CommonHelpers.sendText(driver, property.getProperty("loc_birthday"), Userdata.getProperty("data_birthday"));
		log.info("Enter estimation month");

		CommonHelpers.sendText(driver, property.getProperty("loc_month"), Userdata.getProperty("data_month"));
		log.info("Enter loginbutton");

		CommonHelpers.clickAction(driver, property.getProperty("loc_button"));
		log.info("Enter address");

		CommonHelpers.sendText(driver, property.getProperty("loc_address"), Userdata.getProperty("data_address"));
		log.info("Enter secondaddress");

		CommonHelpers.sendText(driver, property.getProperty("loc_secondaddress"),
				Userdata.getProperty("data_secondaddress"));
		log.info("Enter cityname");

		CommonHelpers.sendText(driver, property.getProperty("loc_city"), Userdata.getProperty("data_city"));
		log.info("Enter statename");

		CommonHelpers.sendText(driver, property.getProperty("loc_state"), Userdata.getProperty("data_state"));
		log.info("Enter country");

		CommonHelpers.sendText(driver, property.getProperty("loc_country"), Userdata.getProperty("data_country"));
		log.info("Enter postal code");

		CommonHelpers.sendText(driver, property.getProperty("loc_postalcode"), Userdata.getProperty("data_postalcode"));
		log.info("Enter loginbutton");

		CommonHelpers.clickAction(driver, property.getProperty("loc_button"));
		log.info("Enter phonenumber");

		CommonHelpers.sendText(driver, property.getProperty("loc_phonenumber"),
				Userdata.getProperty("data_phonenumber"));
		CommonHelpers.clickAction(driver, property.getProperty("loc_button"));
		log.info("Selecting relationship");

		CommonHelpers.dropDownMenu(driver, property.getProperty("loc_relationship"), "Doctor");
		log.info("Enter name of the person");

		CommonHelpers.sendText(driver, property.getProperty("loc_nameoftheperson"),Userdata.getProperty("data_nameoftheperson"));
		log.info("Enter loginbutton");

		CommonHelpers.clickAction(driver, property.getProperty("loc_button"));
		log.info("Enter confirmbutton");

		CommonHelpers.clickAction(driver, property.getProperty("loc_confirmbutton"));
		log.info("Clicking  homepageicon");

		CommonHelpers.clickAction(driver, property.getProperty("loc_homepageicon"));
		log.info("Clicking  patient record");

		CommonHelpers.clickAction(driver, property.getProperty("loc_findpatientrecord"));
		log.info("Enter patient search");

		CommonHelpers.sendText(driver, property.getProperty("loc_patientsearch"), Userdata.getProperty("user_id"));
		log.info("Clicking homepageicon");

		CommonHelpers.clickAction(driver, property.getProperty("loc_homepageicon"));
		log.info("Clicking  datamanagement");

		CommonHelpers.clickAction(driver, property.getProperty("loc_datamanagement"));
		log.info("Clicking mergerecords");

		CommonHelpers.clickAction(driver, property.getProperty("loc_mergerecords"));
		log.info("Enter patient  id");

		CommonHelpers.sendText(driver, property.getProperty("loc_patienttext"), Userdata.getProperty("patient_id"));
		log.info("Enter second patient  id");

		CommonHelpers.sendText(driver, property.getProperty("loc_secondpatienttext"),Userdata.getProperty("secondpatient_id"));
		log.info("Clicking confirm button");

		CommonHelpers.clickAction(driver, property.getProperty("loc_conbutton"));

	}
}
