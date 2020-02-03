package com.auxenta.application;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class UtilFile {
	static boolean status = true;
	final static Logger logger = LogManager.getLogger(UtilFile.class);

	public static void handleUser() {

		while (status) {
			input();
		}
		logger.info("Process Completed!!!");
	}

	public static void input() {

		Scanner input = new Scanner(System.in);

		logger.info("Enter the Source Flie Path : ");

		String from = input.nextLine();
		if (Validation.isPathEmpty(from)) {
			logger.error("Source File Path is not entered.");
		} else {
			logger.info("Enter the Target File Path : ");

			String to = input.nextLine();
			if (to.isEmpty()) {
				logger.error("Target File Path is not entered.");

			} else {

				if (from.equals(to)) {
					logger.error(" Source  and destination  are the same");
				} else {

					Utils.copyFile(from, to);
					logger.info("Do you want to copy another file(y/n) : ");

					String setStatus = input.next();

					if (setStatus.equalsIgnoreCase("n")) {

						UtilFile.status = false;
					}
				}

			}
		}
	}
}
