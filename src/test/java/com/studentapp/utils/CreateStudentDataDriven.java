package com.studentapp.utils;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;


@Concurrent(threads="4x")
@UseTestDataFrom("testData/studentInfo.csv")
@RunWith(SerenityParameterizedRunner.class)  ///Serenity Data Driven class
public class CreateStudentDataDriven extends TestBase {

	
	//MEMBER VARIABLES OR FIELDS
	private String lastName;
	private String email;
	private String programm;
	private String course;

	@Steps
	StudentSerenitySteps steps;

	@Title("DataDriven Test for adding multiple students to the application")
	@Test
	public void createMultipleStudents() {
		ArrayList<String> courses = new ArrayList<>();
		courses.add(course);
		steps.createStudent(firstName, lastName, email, programm, courses)
		.statusCode(201);
	}
	
	
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProgramme() {
		return programm;
	}

	public void setProgramme(String programm) {
		this.programm = programm;
	}

	public String getCourses() {
		return course;
	}

	public void setCourses(String course) {
		this.course = course;
	}

	public StudentSerenitySteps getSteps() {
		return steps;
	}

	public void setSteps(StudentSerenitySteps steps) {
		this.steps = steps;
	}

}
