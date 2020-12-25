package com.atmecs.openmrs.constants;

import java.io.File;
import com.atmecs.openmrs.readerlocation.PropertyReader;

public class Constants {
	public static final String User_Home = System.getProperty("user.dir") + File.separator;
	public static final String Chrome_file = "./lib/chromedriver.exe";
	public static final String Firefox_file = "./lib/geckodriver.exe";

	
	public static final String Location_Reader = "./src/main/java/com/atmecs/readerlocation";
	public static final String Config_file = "./src/main/resources/config.properties";
	public static final String locator_path = "./src/main/resources/testdata/login.properties";
	public static final String User_path = "./src/main/resources/testdata/login.properties";
	public static final String Valid_path = "./src/test/resources/Userinformation.xlsx";
	public static final String Log4j_file = "./log/log4J.properties";

	public static final String Login_xls ="./src/main/resources/testdata/OpenMrLogin.xlsx";
	public static final String Login_Path="./src/main/resources/locators/Login.properties";
	
	
	public static final String Registerlocator_Path="./src/main/resources/locators/register.properties";
	public static final String Registeruserdata_Path="./src/main/resources/testdata/registerdata.properties";
}


