package com.studentapp.cucumber.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.hamcrest.Matcher;
import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.utils.TestUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FeatureFile_Steps  {

	
	static String email=null;
	@Steps
	StudentSerenitySteps steps;
	
	@Given("^User sends a GET request to the list endpoint,they must get back a valid status code$")
	public void user_sends_a_GET_request_to_the_list_endpoint_they_must_get_back_a_valid_status_code() {
		SerenityRest.rest()
		.given().when()
		.get("/list")
		.then()
		.statusCode(200);
	}


	@Given("^I created a new student firstname (.*) lastname (.*) email (.*) programm (.*)$")
	public void i_created_a_new_student(String firstName,String lastName,String _email,String programm,String course) {
		java.util.List<String> courses = new ArrayList<>();
		courses.add(course);
		email = TestUtils.getRandomValue()+_email;
	   steps.createStudent(firstName, lastName, email, programm, courses)
	   .assertThat().statusCode(201);
	}

	@Then("^I verify that the student with (.*) is created$")
	public void i_verify_that_the_emailis_created(String emailId) {
	   HashMap<String,Object> actualValu = steps.getStudentInfo(emailId);
	   assertThat(actualValu,hasValue(email));
	  
	}

}
