package com.auxenta.application;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Utils {

	public static boolean copyFile(String from, String to) {
		final Logger logger = LogManager.getLogger(Utils.class);
		File source = new File(from);
		File target = new File(to);
		try {
			if(source.equals(target)) {
				throw new IOException("message");
				}
			if (Validation.isPathDirectory(source)) {
				FileUtils.copyDirectory(source, target);
				logger.info("Directory Succussfully Copied..!!!!");
			} else {
				FileUtils.copyFile(source, target);
				logger.info("File Succussfully Copied..!!!!");
			}
			return true;
		} catch (IOException e) {
			logger.error("Please provide the proper path...!!");
			return false;
		}

	}
}