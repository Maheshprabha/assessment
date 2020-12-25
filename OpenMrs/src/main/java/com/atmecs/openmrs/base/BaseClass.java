package com.atmecs.openmrs.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.atmecs.openmrs.constants.Constants;
import com.atmecs.openmrs.readerlocation.PropertyReader;
import com.atmecs.openmrs.report.Reports;

public class BaseClass {
	public Properties properties;
	public  WebDriver driver;
	String baseUrl;
	String browser;
	Reports log=new Reports();
	
	@BeforeMethod
	public void invokeBrowser() {

		properties = PropertyReader.readProperties(Constants.Config_file);

		baseUrl = properties.getProperty("Url");
		browser=properties.getProperty("Browser_name");
	
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",Constants.Chrome_file);
			driver = new ChromeDriver(); 
			//log.info("chrome launched successfully");
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver",Constants.Firefox_file);	
			driver = new FirefoxDriver(); 
		}

		driver.get(baseUrl);
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//log.info("url launched successfully");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}


