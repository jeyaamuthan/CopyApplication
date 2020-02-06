package com.auxenta.application;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FileUtil {
	final static Logger logger = LogManager.getLogger(FileUtil.class);

	public static boolean copySource(File source, File target) {
		/*
		 * File source = new File(sou); File target = new File(tar);
		 */
		try {
			if (Validation.isPathDirectory(source)) {
				FileUtils.copyDirectory(source, target);
				logger.info("Directory Succussfully Copied..!!!!");
				return true;
			} else {
				FileUtils.copyFileToDirectory(source, target);
				logger.info("File Succussfully Copied..!!!!");
				return true;
			}
		} catch (Exception e) {
			logger.error("Path not Found....!!!!");
		}
		return false;
	}
}
