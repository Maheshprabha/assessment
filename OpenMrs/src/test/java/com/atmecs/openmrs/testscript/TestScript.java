package com.atmecs.openmrs.testscript;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.openmrs.base.BaseClass;
import com.atmecs.openmrs.constants.Constants;
import com.atmecs.openmrs.pages.Homepage;
import com.atmecs.openmrs.readerlocation.Utils;
import com.atmecs.openmrs.report.Reports;

public class TestScript extends BaseClass {
	Reports log = new Reports();

	//@DataProvider
	//public Object[][] getExcelData() {
		//Object[][] data = Utils.getTestData("login", Constants.Login_xls);
		//return data;
	//}

	//@Test(dataProvider = "getExcelData")

	//public void login(String Username, String Password) throws InterruptedException {
	//	log.info("User login process");

		//Homepage login = new Homepage(driver);
		//login.login(Username, Password);
		//log.info("User has been logged sucessfully");

     //  }
//}
	
	@Test
	public void loginpro() {
		Homepage login = new Homepage(driver);
        login.login();
	}
}
