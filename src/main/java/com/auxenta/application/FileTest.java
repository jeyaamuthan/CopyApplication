package com.auxenta.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileTest {
	public static void main(String[] args) throws IOException {
	Files.copy(Paths.get("C:\\Users\\Aux-072\\Desktop\\Test\\A.txt"), Paths.get("C:\\Users\\Aux-072\\Desktop\\Test\\amuthan"), StandardCopyOption.COPY_ATTRIBUTES);
	System.out.println("File copied!!!");
	}

}
