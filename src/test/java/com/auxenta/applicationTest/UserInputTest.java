package com.auxenta.applicationTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.auxenta.application.UserInput;

class UserInputTest {
	@Test
	void handleFileTest() {
		Assertions.assertTrue(UserInput.handleFile(new String[] { "Source", "Target" }));
	}
}
