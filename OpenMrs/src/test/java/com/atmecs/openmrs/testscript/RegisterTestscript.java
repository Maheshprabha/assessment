package com.atmecs.openmrs.testscript;

import org.testng.annotations.Test;

import com.atmecs.openmrs.base.BaseClass;
import com.atmecs.openmrs.pages.Registerpage;
import com.atmecs.openmrs.report.Reports;

public class RegisterTestscript extends BaseClass{
	Reports log = new Reports();
	@Test
  public void register() throws Exception {
	  Registerpage reg = new Registerpage(driver);
      reg.register();
}
}