package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SpringBootTest
class SpringProjCrudOperApplicationTests {

	@Test
	void contextLoads() {
		RestAssured.baseURI = "http://localhost:1234";
		RestAssured.given().get("/getdata").then().statusCode(200).log().body();
		System.out.println("ok");
	}
	

@Test
public void addTestProjectContacts() throws JSONException {
		RestAssured.baseURI = "http://localhost:8080";
		//RestAssured.when().post("/itemdata").then().statusCode(200).log().body();
		JSONObject req = new JSONObject();
		req.put("id",16);
		req.put("name","ranu");
		req.put("age", 26);
		req.put("address","biridi");
	
		System.out.println("req" + req);
		Response res = RestAssured.given().contentType(ContentType.JSON)
				.header("Content-Type", "application/json")
				.body(((Object) req).toString()).when().post("/insert1").then().extract().response();
		System.out.println("res==>" + res.asString());
		String result = res.jsonPath().getString("success");

		String samplepost = "Record  successfully";
		System.out.println("result==>" + result);

		Assert.assertEquals(result, samplepost);

	}
public static void getResponseTime(){
		 RestAssured.baseURI = "http://localhost:8080";
		  System.out.println("time to finish"+RestAssured.given().get("/insert1").
		         timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
}
}


