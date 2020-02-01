package com.auxenta.application;



	import java.io.*;
	import java.nio.file.*;
import java.util.Scanner;
	 
	/**
	 * This program copies a file to another directory using the Java NIO API.
	 *
	 * @author www.codejava.net
	 */
	public class Abc {
	 
	    public static void copyFile(String filePath, String dir) {
	        Path sourceFile = Paths.get(filePath);
	        Path targetDir = Paths.get(dir);
	        Path targetFile = targetDir.resolve(sourceFile.getFileName());
	 
	        try {
	 
	            //Files.copy(sourceFile, targetFile);
	        	Files.copy(Paths.get("C:\\Users\\Aux-072\\Desktop\\Test\\A.txt"), Paths.get("C:\\Users\\Aux-072\\Desktop\\Test\\File.txt"));
	            System.out.println("File copied...!!!");
	 
	        } catch (FileAlreadyExistsException ex) {
	            System.err.format("File %s already exists.", targetFile);
	        } catch (IOException ex) {
	            System.err.format("I/O Error when copying file");
	        }
	    }
	 
	    public static void main(String[] args) throws IOException {
		/*
		 * String filePath = args[0]; String dir = args[1];
		 */
	    	Files.copy(Paths.get("C:\\Users\\Aux-072\\Desktop\\Test.txt"), Paths.get("C:\\Users\\Aux-072\\Desktop\\Test"));
	    	
	        Scanner input = new Scanner(System.in);
			System.out.println("Enter the Source Fie Path : ");
			String filePath = input.next();
			System.out.println("Enter the Target Fie Path : ");
			String dir = input.next();
	        //copyFile(filePath, dir);
	    }
	
}
