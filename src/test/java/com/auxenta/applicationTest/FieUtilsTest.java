package com.auxenta.applicationTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.auxenta.application.FileUtil;

class FileUtilsTest {
	static String path = System.getProperty("user.home") + File.separator + "TestDocuments";
	static File Source1 = new File(path + File.separator + "Test1");
	static File Source2 = new File(path + File.separator + "Test2");
	static File Source3 = new File(Source1 + File.separator + "Test.txt");
	@BeforeAll
	public static void createUtils() throws IOException {
		Source1.mkdirs();
		Source2.mkdirs();
		Source3.createNewFile();
	}
	@AfterAll
	public static void deleteUtils() throws IOException {
		FileUtils.deleteDirectory(Source1);
		FileUtils.deleteDirectory(Source2);
	}
	@Test
	void copySourceTest() {
		Assertions.assertTrue(FileUtil.copySource(Source1, Source2));
		Assertions.assertTrue(FileUtil.copySource(Source3, Source2));
	}
}
