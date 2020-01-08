package com.studentapp.junit;

import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.studentapp.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;


@RunWith(SerenityRunner.class)
public class FirstSerenityTest extends TestBase{

	

	@WithTag("studentFeature:POSITIVE")
	@Title("This test will get All Students from the student Api")
	@Test
	public void getAllStudents() throws IOException {
		SerenityRest.given()
		.when()
		.get("/list")
		.then().assertThat()
		.statusCode(200).log().all();	
	}
	
	
	//@Test
	public void getAllStudent2() {
		Response response = SerenityRest.given()
		.when()
		.get("/list")
		.then().assertThat()
		.statusCode(200).extract().response();
		
		String studentsReturned = response.asString();
		System.out.println(studentsReturned);
		
//		JsonPath jsonPath = new JsonPath(studentsReturned);
//		String jsonResult = jsonPath.get("id");
//		System.out.println(jsonResult);
	
		for(int i=0;i<=studentsReturned.length();i++) {
			
			System.out.println(studentsReturned);
			break;
		}
		

		
		
	}
	
	@WithTag("pending:SMOKE")
	@Pending
	@Test
	public void thisAPendingTest() {
		
	}
	
	
	@WithTag("Ignore:SANITY")
	@Ignore
	@Test
	public void thisAIgnoreTest() {
		
	}
	

	@WithTag("error:SMOKE")
	@Test
	public void thisErrorTest() {
		int[] arr = {1,2,3,4,5,6,9};
		
		for(int x : arr) {
			System.out.println("This an error "+x/5*2+1);
		}
		
	}
	
	@WithTags({
		@WithTag("error:SMOKE"),@WithTag("Ignore:SANITY")
	}) //GROUPING TAGS
	
	@Manual
	@Test
	public void manualTest() {
		
	}
}
