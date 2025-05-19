package com.get;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"api/users?page=2");
		System.out.println(response.getBody().asString());
	}

}
