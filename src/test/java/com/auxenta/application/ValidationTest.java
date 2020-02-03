package com.auxenta.application;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidationTest {
	@Before
	public void createUtils() throws IOException {
		new File("C:\\Users\\Aux-072\\Desktop\\Test1").mkdirs();

		new File("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt").createNewFile();
	}

	@Test
	public void pathEmptytest() {
		String src1 = new String("C:\\Users\\Aux-072\\Desktop\\Test1");

		Assert.assertFalse(Validation.isPathEmpty(src1));
		String src2 = new String("");

		Assert.assertTrue(Validation.isPathEmpty(src2));
	}

	@Test
	public void PathDirectorytest() {
		File src1 = new File("C:\\Users\\Aux-072\\Desktop\\Test1");
		File src2 = new File("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt");
		Assert.assertFalse(Validation.isPathDirectory(src2));

		Assert.assertTrue(Validation.isPathDirectory(src1));
	}

	@After
	public void deleteUtils() throws IOException {
		FileUtils.deleteDirectory(new File("C:\\Users\\Aux-072\\Desktop\\Test1"));

		FileUtils.deleteDirectory(new File("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt"));
	}
}
