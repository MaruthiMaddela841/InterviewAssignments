package com.post;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("maruthi", "sse");
		jsonObject.put("mike", "se");
		request.body(jsonObject.toString());
		Response response = request.post("api/users");
		
		System.out.println("Status Code: "+response.getStatusCode());
	}

}
