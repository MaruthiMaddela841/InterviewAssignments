package com.get;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetExample {

	@JsonIgnoreProperties
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		Response response = RestAssured
	            .given()
	            .baseUri("https://reqres.in")
	            .when()
	            .get("/api/users/3");
		
			System.out.println("Status Line: " +response.getStatusLine());
	        System.out.println("Status Code: " + response.getStatusCode());
	        System.out.println("Response Body: " + response.getBody().asString());
	        System.out.println("Content Type: "+response.contentType());//getContentType()
	        System.out.println("Pretty String: "+response.asPrettyString());
	        System.out.println("*************************************");
	        String json = response.getBody().asString();
	        ObjectMapper mapper = new ObjectMapper();
	        StudentResponse studentResponse = mapper.readValue(json, StudentResponse.class);
	        
	        Student student = studentResponse.data;

	        System.out.println("ID: " + student.id);
	        System.out.println("Name: " + student.first_name + " " + student.last_name);
	        System.out.println("Email: " + student.email);
	        System.out.println("Avatar: " + student.avatar);

	        Support support = studentResponse.support;
	        System.out.println("Support URL: " + support.url);
	        System.out.println("Support Text: " + support.text);
	}

}
