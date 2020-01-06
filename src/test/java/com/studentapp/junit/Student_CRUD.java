package com.studentapp.junit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.model.Student_Class;
import com.studentapp.testbase.TestBase;
import com.studentapp.utils.TestUtils;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static com.studentapp.utils.ReusableSpecifications.*;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Student_CRUD extends TestBase{
	

	static String firstName = "SMOKEUSER"+TestUtils.getRandomValue()+"";
	static String lastName = "SMOKEUSER"+TestUtils.getRandomValue()+"";
	static String programme = "ComputerScience"+TestUtils.getRandomValue()+"";
	static String email = "SMOKEUSER"+TestUtils.getRandomValue()+"@gmail.com";
	static int studentid;

	@Steps
	StudentSerenitySteps steps;
	
	@Title("Create a new student POST METHOD")
	@Test
	public void createStudent001() throws IOException {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add(new String("JAVA"+TestUtils.getRandomValue()+""));
		courses.add("C++"+TestUtils.getRandomValue()+"");
		
		steps.createStudent(firstName, lastName, email, programme, courses)
		.statusCode(201).spec(genericResponse());	
	}
	
	
	@Title("Get Students GET METHOD")
	@Test
	public void getStudents002() throws IOException {
		
		HashMap<String,Object> value =  steps.getStudentInfo(firstName);
				
		assertThat(value,hasValue(firstName));
		studentid = (int) value.get("id");
		System.out.println("The newly created studnet is "+studentid);
		}
	
	
	@Title("Updating the Student Info POST METHOD")
	@Test
	public void putRequest003() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add(new String("JAVA"+TestUtils.getRandomValue()+""));
		courses.add("C++"+TestUtils.getRandomValue()+"");
		
		firstName = firstName+"updated";
		steps.updateStudent(studentid, firstName, lastName, email, programme, courses);
		
		HashMap<String,Object> value =  steps.getStudentInfo(firstName);
		System.out.println("The value is \n"+value);
		assertThat(value,hasValue(firstName));
	}
	
	
	@Title("Deleting Newly Created Student Information DELETE METHOD")
	@Test
	public void deleteRequest004() {
		
		steps.deletingStudentInfo(studentid);
		steps.getDeletedStudentId(studentid).statusCode(404);	
	
	}
}
