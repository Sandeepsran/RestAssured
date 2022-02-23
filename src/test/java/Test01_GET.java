import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test01_GET {

	@Test
	void test1() {
	
		
		Response res= get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		System.out.println(res.getHeader("content-type"));
		System.out.println(res.getStatusCode());
		System.out.println(res.statusLine());
		System.out.println(res.getTime());
	}
	
	@Test
	void test2() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]", equalTo(7));
		
	}
}
