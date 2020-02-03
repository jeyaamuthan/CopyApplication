package com.auxenta.application;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

	@Test
	public void CheckPathType() {
		
		
		
		String src1 = new String("C:\\Users\\Aux-072\\Desktop\\Test1");
		String src2 = new String("C:\\Users\\Aux-072\\Desktop\\Test2");
		Assert.assertTrue(CheckPathType.copyFile(src1, src2));
		String src3 = new String("C:\\Users\\Aux-072\\Desktop\\Test1");
		String src4 = new String("C:\\Users\\Aux-072\\Desktop\\Test1");
		Assert.assertFalse(CheckPathType.copyFile(src3, src4));
		String src5 = new String("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt");
		String src6 = new String("C:\\Users\\Aux-072\\Desktop\\Test1\\test2.txt");
		Assert.assertTrue(CheckPathType.copyFile(src5, src6));
		String src7 = new String("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt");
		String src8 = new String("C:\\Users\\Aux-072\\Desktop\\Test2\\test1.txt");
		Assert.assertTrue(CheckPathType.copyFile(src7, src8));
		String src9 = new String("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt");
		String src10 = new String("C:\\Users\\Aux-072\\Desktop\\Test2\\test2.txt");
		Assert.assertTrue(CheckPathType.copyFile(src9, src10));
		String src11 = new String("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt");
		String src12 = new String("C:\\Users\\Aux-072\\Desktop\\Test1\\test1.txt");
		Assert.assertFalse(CheckPathType.copyFile(src11, src12));
		String src13 = new String("");
		String src14 = new String("");
		Assert.assertFalse(CheckPathType.copyFile(src13, src14));
		String src15 = new String("Wrong source path format");
		String src16 = new String("wrong target path format");
		Assert.assertFalse(CheckPathType.copyFile(src15, src16));
		
		
	}
	

}
