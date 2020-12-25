package com.atmecs.openmrs.report;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.atmecs.openmrs.constants.Constants;

public class Reports {
	Logger logger = null;


	public Reports() {
		
		logger = Logger.getLogger(Reports.class.getName());
		try {
			configureLogger();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void configureLogger() throws IOException {
		PropertyConfigurator.configure(Constants.Log4j_file);

	}

	public void info(String info) {
		logger.info(info);
	}

}
