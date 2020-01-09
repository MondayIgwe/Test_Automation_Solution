package com.studentapp.cucumber.steps;

import org.apache.xerces.impl.dv.dtd.StringDatatypeValidator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

public class FeatureFile_Steps  {

	
	@Given("^User sends a GET request to the list endpoint,they must get back a valid status code$")
	public void user_sends_a_GET_request_to_the_list_endpoint_they_must_get_back_a_valid_status_code() {
		SerenityRest.rest()
		.given().when()
		.get("/list")
		.then()
		.statusCode(200);
	}


	@Given("^I created a new student firstname (.*) lastname (.*) email (.*) programm (.*)$")
	public void i_created_a_new_student(String firstname,String lastname,String email,String programm) {
	   
	}

	@Then("^I verify that the student with (.*) is created$")
	public void i_verify_that_the_emailis_created(String email) {
	   
	}
}
