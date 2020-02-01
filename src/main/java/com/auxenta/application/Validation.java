package com.auxenta.application;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class Validation {

	public boolean isPathEmpty(String path) {

		/*
		 * try {
		 * 
		 * path.isEmpty();
		 * 
		 * } catch (InvalidPathException ex) { return false; }
		 */

		return path.isEmpty();
	}
	/*
	 * public boolean isPath(File path) {
	 * 
	 * try {
	 * 
	 * path.isEmpty();
	 * 
	 * } catch (InvalidPathException ex) { return false; }
	 * 
	 * return true; }
	 */
//	 public boolean isPath(File path) {
//		 return path.isFiles();
//	 }
}
