package com.auxenta.application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class DirectoryCopy {

	/**
	 * This function recursively copy all the sub folder and files from sourceFolder
	 * to destinationFolder
	 * 
	 * @throws IOException
	 */
	public static void copyFolder(File sourceFolder, File destinationFolder) throws IOException {

		if (sourceFolder.equals(destinationFolder)) {
			System.out.println("folder already exit name");
		} else if (sourceFolder.getPath() != sourceFolder.getAbsolutePath()) {
			System.out.println("test path name");
		} else if (sourceFolder.isDirectory()) {
			// Verify if destinationFolder is already present; If not then create it
			if (!destinationFolder.exists()) {
				destinationFolder.mkdir();
				// System.out.println("Directory created :: " + destinationFolder);
			}
			System.out.println("Directory created :: " + destinationFolder);

			// Get all files from source directory
			String files[] = sourceFolder.list();

			// Iterate over all files and copy them to destinationFolder one by one
			for (String file : files) {
				File srcFile = new File(sourceFolder, file);
				File destFile = new File(destinationFolder, file);

				// Recursive function call
				copyFolder(srcFile, destFile);
			}
		} else {
			File file = new File("");

			if (sourceFolder.equals(destinationFolder)) {
				System.out.println("already exit name");
			} else if (sourceFolder.getPath() != sourceFolder.getAbsolutePath()) {
				System.out.println("test path name");
			}

			else {
				// Copy the file content from one place to another
				try {
					Files.copy(sourceFolder.toPath(), destinationFolder.toPath(), StandardCopyOption.REPLACE_EXISTING);

				} catch (IOException e) {

					// e.printStackTrace();
					System.out.println("Please provide the proper file path");
				}
				System.out.println("File copied :: " + destinationFolder);
				// System.out.println("File Copied!!!");
			}
		}
	}
}