import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01Get {
	@Test
	void test_o1() {
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getHeader("content-type"));
		
		//System.out.println(res.getStatusCode().asString());
		System.out.println();
		
		
	}
	

}
