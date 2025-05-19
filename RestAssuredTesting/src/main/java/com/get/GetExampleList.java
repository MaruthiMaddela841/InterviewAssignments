package com.get;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetExampleList {

	@JsonIgnoreProperties
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		Response response = RestAssured
	            .given()
	            .baseUri("https://reqres.in")
	            .when()
	            .get("/api/users?page=2");

	        System.out.println("Status Code: " + response.getStatusCode());
	        System.out.println("Response Body: " + response.getBody().asString());
	        
	        System.out.println("*************************************");
	        String json = response.getBody().asString();
	        ObjectMapper mapper = new ObjectMapper();
	        StudentListResponse studentList = mapper.readValue(json, StudentListResponse.class);
	        
	        
	        System.out.println("Page: "+studentList.page);
	        System.out.println("Per Page: "+studentList.per_page);
	        System.out.println("Total: "+studentList.total);
	        System.out.println("Total Pages: "+studentList.total_pages);
	        System.out.println("Student Data:");
	        // Print data
	        for (Student student : studentList.data) {
	            System.out.println(student.id + " - " + student.first_name + " " + student.last_name + " - " + student.email);
	        }

	        // Support info
	        System.out.println("Support: " + studentList.support.text);
	}

}
