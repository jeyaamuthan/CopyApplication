package com.auxenta.main;



import org.junit.Assert;
import org.junit.Test;

import com.auxenta.application.MoveFile;

public class MoveFileTest {

	@Test
	public void test() {
		MoveFile movefile= new MoveFile();
		Assert.assertTrue(movefile.copyFile("C:\\Users\\Aux-072\\Desktop\\Y\\A.txt","C:\\Users\\Aux-072\\Desktop\\x\\A.txt"));
	}

}
