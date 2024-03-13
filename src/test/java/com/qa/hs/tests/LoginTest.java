package com.qa.hs.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeywordEngine;

public class LoginTest {
	
	public KeywordEngine keyWordEngine;
	
	@Test
	public void loginTest() throws IOException
	{
		keyWordEngine = new KeywordEngine();
		keyWordEngine.startExecution("login");
	}
	
	@Test
	public void signUpTest() throws IOException
	{
		keyWordEngine = new KeywordEngine();
		keyWordEngine.startExecution("signup");
	}
	
}
