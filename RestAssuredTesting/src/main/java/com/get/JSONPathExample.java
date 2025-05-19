package com.get;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JSONPathExample {

	public static void main(String[] args) {
		
		Response response=RestAssured.get("https://reqres.in/api/users/3");
		JsonPath jsonPath = response.jsonPath();
		String name=jsonPath.get("data.first_name");
		System.out.println(name);
		
	}

}
