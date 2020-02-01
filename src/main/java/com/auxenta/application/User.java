package com.auxenta.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class User {

	static boolean status = true;

	public static void inputUser() throws IOException {

		while (status) {
			User.input();
		}

		System.out.println("Process Completed!!!");

	}

	public static void input() throws IOException {
		Validation valid = new Validation();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Source File Path : ");
		String srcFilePath = input.nextLine();
		if (valid.isPathEmpty(srcFilePath)) {

			System.out.println("Source File Path is not entered.");
		} else {

			System.out.println("Enter the Target File Path : ");
			String tarFilePath = input.nextLine();

			if (valid.isPathEmpty(tarFilePath)) {
				System.out.println("Target File Path is not entered.");
			} else {

				File sourceFolder = new File(srcFilePath);

				File destinationFolder = new File(tarFilePath);

				//DirectoryCopy.copyFolder(sourceFolder, destinationFolder);
				Test.copyFiles(sourceFolder, destinationFolder);

				System.out.println("Do you want to copy another file(y/n) : ");

				String setStatus = input.nextLine();

				if (setStatus.equalsIgnoreCase("n")) {

					User.status = false;
				}
			}

		}

	}
}
