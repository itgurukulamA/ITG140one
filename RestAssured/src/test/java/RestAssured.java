import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

import org.hamcrest.Matchers.*;

public class RestAssured {
	@org.testng.annotations.Test
	public void Test() {
		Response response = io.restassured.RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.asPrettyString());
		System.out.println(response.getHeaders());
		System.out.println(response.getContentType());
	}
}
