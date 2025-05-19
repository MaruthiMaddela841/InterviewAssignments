package com.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ShishiraExp {

	public static void main(String[] args) {
		
		Response response = RestAssured
	            .given()
	            .baseUri("https://reqres.in")
	            .when()
	            .get("/api/users/4");
		String json = response.getBody().asString();
		System.out.println(json);
		int start=json.indexOf("\"email\":\"");
		start=start+9;
		int ending=json.indexOf("\",\"first_name\"");
		String substring = json.substring(start, ending);
		System.out.println(substring);
	}

}
