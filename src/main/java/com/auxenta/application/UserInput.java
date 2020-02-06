package com.auxenta.application;

import java.io.File;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class UserInput {
	static Boolean check= false;
	final static Logger logger = LogManager.getLogger(UserInput.class);
	public static boolean handleFile(String[] args) {
		try { 
			Validation.CheckArgs(args);
			File source = new File(args[0]);
			File target = new File(args[1]);
			FileUtil.copySource(source, target);
			check=true;
		} catch (Exception e) {
			logger.error("There is an error..!!!");		 
		}
		return check;
	}
}
