package com.auxenta.application;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CopyFiles {
	static boolean status = true;

	public static void inputUser() throws IOException {

		while (status) {
			CopyFiles.input();
		}

		System.out.println("Process Completed!!!");

	}

	public static void input() throws IOException {
		final Logger logger = LogManager.getLogger(CopyFiles.class);
		Scanner input = new Scanner(System.in);
		Validation valid = new Validation();
		logger.info("Enter the Source Flie Path : ");
		System.out.println("Enter the Source File Path : ");
		String from = input.nextLine();
		if (valid.isPathEmpty(from)) {
			System.out.println("Source File Path is not entered.");
		} else {

			System.out.println("Enter the Target File Path : ");
			String to = input.nextLine();
			if (to.isEmpty()) {
				System.out.println("Target File Path is not entered.");
			} else {

				CheckPathType.copyFile(from, to);

				System.out.println("Do you want to copy another file(y/n) : ");

				String setStatus = input.next();

				if (setStatus.equalsIgnoreCase("n")) {

					CopyFiles.status = false;
				}
			}
		}
	}
}
