package com.auxenta.application;

import java.io.File;

public class Validation {

	public boolean isPathEmpty(String path) {

		

		return path.isEmpty();
	}
	
	  public boolean isPathDirectory(File path) {
	
	 return path.isDirectory(); 
	 
}
}
