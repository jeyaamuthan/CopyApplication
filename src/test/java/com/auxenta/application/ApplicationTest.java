package com.auxenta.application;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

	@Test
	public void test() {
		
		DirectoryCopy movefile= new DirectoryCopy();
		File sourceFolder ;
		File destinationFolder ;
		Assert.assertTrue(movefile.copyFolder(sourceFolder, destinationFolder);
	}

}
