package com.auxenta.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFIle {
	public static void xyz( Path sourceDirectory, Path targetDirectory) {
		boolean test = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Source Fie Path : ");
		String srcFilePath = input.next();
		System.out.println("Enter the Target Fie Path : ");
		String tarFilePath = input.next();
		
		
		
    	Path sourceDirectory1 = Paths.get(srcFilePath);
    	Path targetDirectory1 = Paths.get(tarFilePath);
         //Source directory which you want to copy to new location
         //File sourceDirectory1 = new File(srcFilePath);
          
         //Target directory where files should be copied
       //  File targetDirectory1 = new File(tarFilePath);
		

		if (sourceDirectory1.equals(targetDirectory1)) {
			System.out.println("already exit name");
		}

		else {
			
			
			try {
				Files.copy(sourceDirectory1,targetDirectory,  StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			/*
			 * for (File srcFile: sourceDirectory.listFiles()) { if (srcFile.isDirectory())
			 * { FileUtils.copyDirectoryToDirectory(srcFile, targetDirectory); } else if
			 * (srcFile.isFile()) { FileUtils.copyFileToDirectory(srcFile, targetDirectory);
			 * } }
			 */
			/*
			 * Files.copy(sourceDirectory.toPath(), targetDirectory.toPath(),
			 * StandardCopyOption.REPLACE_EXISTING); test = true;
			 */				System.out.println("File Copied!!!");
		}
		

	}

	

}
