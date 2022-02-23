import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class Teset11_POST {

	
	
	@Test
	public void Post1() {
		JSONObject request = new JSONObject();
		request.put("Firstname", "Sandeep");
		request.put("LastName", "Sran");
		
		given()
		       .contentType(ContentType.JSON).accept(ContentType.JSON)   
		       .body(request.toJSONString())
		.when()
		       .post("https://reqres.in/api/users")
		.then()
		       .statusCode(201)
		       .log().all();	
	}
	
	//@Test
	public void Put_1() {
		JSONObject request = new JSONObject();
		request.put("Firstname", "Sandeep");
		
		
		given()
		       .body(request.toJSONString())
		.when()
		       .put("https://reqres.in/api/users")
		.then()
		       .statusCode(200);	
	}
	
//	@Test
	public void Delete1() {
		JSONObject request = new JSONObject();
		request.put("Firstname", "Sandeep");
		
		
		given()
		       .body(request.toJSONString())
		.when()
		       .put("https://reqres.in/api/users")
		.then()
		       .statusCode(204);	
	}
	
}
