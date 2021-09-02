package com.example.demo;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

@SpringBootTest
class SpringProjCrudOper2ApplicationTests2 {

	@Test
	void contextLoads() {
		RestAssured.baseURI="http://localhost/8080";
		RestAssured.given().get("/selection").then().statusCode(200).log().body();
		System.out.println("ok");
	}
	@Test
	public void addTestProjectContacts() throws JSONException {
			RestAssured.baseURI = "http://localhost:8080";
			
			JSONObject req = new JSONObject();

			req.put("id",154);
			req.put("name", "munil");
			req.put("age",9);
			req.put("address","mp");
		
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

	}

