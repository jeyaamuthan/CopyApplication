package com.auxenta.main;



import org.junit.Assert;
import org.junit.Test;

import com.auxenta.application.CopyFIle;

public class CopyFIleTest {

	@Test
	public void test_moveFile() {
		
		CopyFIle copyfile= new CopyFIle();
		Assert.assertTrue(copyfile.moveFile("C:\\Users\\Aux-072\\Desktop\\x\\A.txt","C:\\Users\\Aux-072\\Desktop\\y\\A.txt"));
	}

}
