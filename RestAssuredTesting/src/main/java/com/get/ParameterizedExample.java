package com.get;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ParameterizedExample {

	public static void main(String[] args) throws IOException {
		Response response = RestAssured
	            .given()
	            .baseUri("https://reqres.in")
	            .when()
	            .get("/api/users?page=2");
	        String json = response.getBody().asString();
	        ObjectMapper mapper = new ObjectMapper();
	        StudentListResponse studentList = mapper.readValue(json, StudentListResponse.class);
	        
	        FileInputStream fis= new FileInputStream("src\\main\\resources\\test.xlsx");
	        XSSFWorkbook workbook=new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet("test");
	        int lastRowNum = sheet.getLastRowNum();
	        System.out.println("Student Data:");
	        for(int i=1;i<=lastRowNum;i++) {
	        	String email=sheet.getRow(i).getCell(0).getStringCellValue();
		        // Print data
		        for (Student student : studentList.data) {
		        	if(student.email.equals(email)) {
		        		System.out.println(student.id + " - " + student.first_name + " " + student.last_name + " - " + student.email);
		        	}
		        }
	        }
	        
	        

	}

}
