package com.auxenta.application;

import java.io.File;

public class Validation {
	

	private Validation(String path) {
	}

	public static boolean isPathEmpty(String path) {

		return path.isEmpty();
	}

	public static boolean isPathDirectory(File path) {

		return path.isDirectory();

	}
}
