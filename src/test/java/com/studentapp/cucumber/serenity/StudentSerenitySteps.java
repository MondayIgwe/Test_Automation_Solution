package com.studentapp.cucumber.serenity;


import java.util.HashMap;
import java.util.List;
import com.studentapp.model.Student_Class;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static com.studentapp.utils.ReusableSpecifications.*;

public class StudentSerenitySteps {

	
	@Step("Initially Creating the Student firstName:{0}, lastName:{1}, email:{2}, programme:{3}, courses:{4}")
	public ValidatableResponse createStudent(String firstName, String lastName,String email, String programme,
			List<String>courses)
	{
		Student_Class student = new Student_Class();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setEmail(email);
		student.setProgramme(programme);
		student.setCourses(courses);
		
		return SerenityRest.given()
		.spec(genericRequestSpec())
		.when()
		.body(student).log().body()
		.post()
		.then()
		.log().all();
		
	}
	
	@Step("Get Created Student Information:{0}")
	public HashMap<String, Object> getStudentInfo(String firstName){
		String p1 = "findAll{it.firstName=='";
		String p2 = "'}.get(0)";
		
		return SerenityRest.given()
		.when()
		.get("/list")
		.then().assertThat()
		.statusCode(200)
		.extract()
		.path(p1+firstName+p2);	
		
		
	}

	@Step("Updating Student ID studentid:{0},firstName:{1}, lastName:{2}, email:{3}, programme:{4}, courses:{5}")
	public ValidatableResponse updateStudent(int studentid, String firstName, String lastName,String email, String programme,
			List<String>courses) 
	{ 
		Student_Class student = new Student_Class();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setEmail(email);
		student.setProgramme(programme);
		student.setCourses(courses);
	
		return SerenityRest.given()
				.spec(genericRequestSpec())
				.when()
				.log().all()
				.when()
				.body(student)
				.put("/"+studentid)
				.then()
				.log().all();
	}
	
	@Step("Deleting Student information with studentid:{0}")
	public void deletingStudentInfo(int studentid) {
		
		SerenityRest.given()
				.spec(genericRequestSpec())
				.when()
				.delete("/"+studentid);
		
	}
	
	@Step("Getting Student Info studentid:{0} ")
	public ValidatableResponse getDeletedStudentId(int studentid) {
		 ValidatableResponse id =  SerenityRest.given()
		.spec(genericRequestSpec())
		.when()
		.get("/"+studentid)
		.then().log().all();
		 
		 return id;
	}
}
