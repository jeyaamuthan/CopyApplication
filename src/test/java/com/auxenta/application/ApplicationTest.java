package com.auxenta.application;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
	@Before
	public void createUtils() throws IOException {
		new File("C:\\Users\\Aux-072\\Desktop\\Test1").mkdirs();
		new File("C:\\Users\\Aux-072\\Desktop\\Test2").mkdirs();
		new File("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt").createNewFile();
	}

	@Test
	public void CheckPathType() {

		String src1 = new String("C:\\Users\\Aux-072\\Desktop\\Test1");
		String src2 = new String("C:\\Users\\Aux-072\\Desktop\\Test2");
		String src3 = new String("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt");
		String src4 = new String("C:\\Users\\Aux-072\\Desktop\\Test1\\test2.txt");
		String src5 = new String("C:\\Users\\Aux-072\\Desktop\\Test2\\test1.txt");
		String src6 = new String("C:\\Users\\Aux-072\\Desktop\\Test2\\test2.txt");
		String src7 = new String("Wrong source path format");

		Assert.assertTrue(Utils.copyFile(src1, src2));

		Assert.assertFalse(Utils.copyFile(src1, src1));

		Assert.assertTrue(Utils.copyFile(src3, src4));

		Assert.assertTrue(Utils.copyFile(src3, src5));

		Assert.assertTrue(Utils.copyFile(src3, src6));

		Assert.assertFalse(Utils.copyFile(src3, src3));

		Assert.assertFalse(Utils.copyFile(src7, src7));

	}

	@After
	public void deleteUtils() throws IOException {
		FileUtils.deleteDirectory(new File("C:\\Users\\Aux-072\\Desktop\\Test1"));
		FileUtils.deleteDirectory(new File("C:\\Users\\Aux-072\\Desktop\\Test2"));
		FileUtils.deleteDirectory(new File("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt"));
	}

}
