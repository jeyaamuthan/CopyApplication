package com.auxenta.application;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CheckPathType {

	public static boolean copyFile(String from, String to) {
		final Logger logger = LogManager.getLogger(CheckPathType.class);
		Validation valid = new Validation();
		File source = new File(from);
		File target = new File(to);

		try {
			if (valid.isPathDirectory(source)) {
				FileUtils.copyDirectory(source, target);
				System.out.println("Directory Succussfully Copied..!!!!");
				logger.info("Directory Succussfully Copied..!!!!");

			} else {
				FileUtils.copyFile(source, target);
				System.out.println("File Succussfully Copied..!!!!");
				logger.info("File Succussfully Copied..!!!!");

			}
			return true;

		} catch (IOException e) {
			logger.error("Please provide the proper path...!!");
			System.out.println(e + " " + "Please provide the proper path...!!");
			return false;
		}

	}
}