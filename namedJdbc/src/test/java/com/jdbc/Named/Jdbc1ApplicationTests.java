package com.jdbc.Named;


import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;
@SpringBootTest
class Jdbc1ApplicationTests {

	@Test
	public void Test() {
		Response response = io.restassured.RestAssured.get("http://localhost:8080/Gstudent");
		System.out.println(response.asPrettyString());
		System.out.println(response.getHeaders());
		System.out.println(response.getContentType());
	}

}
