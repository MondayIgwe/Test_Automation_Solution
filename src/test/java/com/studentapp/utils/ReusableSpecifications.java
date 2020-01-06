package com.studentapp.utils;

import java.util.concurrent.TimeUnit;

import org.mockito.internal.matchers.LessThan;
import static org.hamcrest.Matchers.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ReusableSpecifications {

	public static RequestSpecBuilder requestSpecBuilder;
	public static RequestSpecification requestSpecification;
	public static ResponseSpecBuilder responseSpecBuilder;
	public static ResponseSpecification responseSpecification;
	
	
	public static RequestSpecification genericRequestSpec() {
		requestSpecBuilder = new RequestSpecBuilder();
		requestSpecBuilder.setContentType(ContentType.JSON);
		requestSpecification = requestSpecBuilder.build();
		return requestSpecification;
		
	}
	
	public static ResponseSpecification genericResponse() {
		responseSpecBuilder = new ResponseSpecBuilder();
		responseSpecBuilder.expectHeader("Content-Type", "application/json;charset=UTF-8");
		responseSpecBuilder.expectResponseTime(lessThan(5L),TimeUnit.SECONDS);
		responseSpecification = responseSpecBuilder.build();
		return responseSpecification;
	}
}
