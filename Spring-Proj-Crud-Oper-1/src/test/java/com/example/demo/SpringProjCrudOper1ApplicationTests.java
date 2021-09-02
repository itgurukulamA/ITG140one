package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

@SpringBootTest
class SpringProjCrudOper1ApplicationTests {


	@org.testng.annotations.Test
	void contextLoads() {
		RestAssured.baseURI = "http://localhost:9090";
		RestAssured.given().get("/getall").then().statusCode(200).log().body();
		System.out.println("ok");
	}
    @org.testng.annotations.Test
    public void TestforPost() throws JSONException
    {
    	RestAssured.baseURI = "http://localhost:9090";
		JSONObject req = new JSONObject();

		req.put("id", 6);
		req.put("name", "Bhaskar");
		System.out.println("req" + req);
		Response res = RestAssured.given().contentType(ContentType.JSON)
				.header("Content-Type", "application/json")
				.body(((Object) req).toString()).when().post("/addperson").then().extract().response();
		System.out.println("res==>" + res.asString());
		

    }
    @org.testng.annotations.Test
    public void TestforPut() throws JSONException
    {
    	RestAssured.baseURI = "http://localhost:9090";
		JSONObject req = new JSONObject();
		req.put("id", 4);
		req.put("name", "Swethak Dunna");
		System.out.println("req" + req);
		Response res = RestAssured.given().contentType(ContentType.JSON)
				.header("Content-Type", "application/json")
				.body(req.toString()).when().put("/updateperson").then().extract().response();
		System.out.println("res==>" + res.asString());

    }
    @org.testng.annotations.Test
    public void TestforDelete() throws JSONException
    {
    	RestAssured.baseURI = "http://localhost:9090";
		JSONObject req = new JSONObject();
		req.put("id", 3);
		System.out.println("req" + req);
		Response res = RestAssured.given().contentType(ContentType.JSON)
				.header("Content-Type", "application/json")
				.body(req.toString()).when().delete("/deletebyid").then().extract().response();
		System.out.println("res==>" + res.asString());

    }
}
