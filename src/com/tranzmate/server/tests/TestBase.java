package com.tranzmate.server.tests;

import com.tranzmate.server.resources.CreateRequest;
import com.tranzmate.server.resources.ValidateResponse;

public class TestBase {
	final String stageUrlGetLiveData = "http://46.137.191.82:8080/services-app/services/Users/ActiveAlerts";
	final String stageUserId = "3249541";
	final String stageClientVersion = "3.3.0";

	CreateRequest createRequest = new CreateRequest();
	ValidateResponse validateResponse = new ValidateResponse();

}
