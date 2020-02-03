package com.auxenta.application;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;

public class Application {
	public static void main(String[] args)  {
		BasicConfigurator.configure();
		try {
			CopyFiles.inputUser();
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}
}
