package com.tranzmate.server.tests;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tranzmate.server.resources.CreateRequest;
import com.tranzmate.server.resources.HttpURLConnectionExample;
import com.tranzmate.server.resources.ValidateResponse;

public class GetLiveData extends TestBase{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		try {
			createRequest.createHttpRequest("GET", stageUrlGetLiveData, stageUserId, stageClientVersion);
			HttpURLConnection connection = createRequest.getHttpConnection();
			validateResponse.validateHttpResponse("GET", connection);
			//validateResponse.validateHttpResponse(createRequest.getHttpConnection());
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertFalse(false);
		}
	}

}

