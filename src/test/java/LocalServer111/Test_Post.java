package LocalServer111;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_Post {
	//@Test
	public void post1() {
		JSONObject request1 = new JSONObject();
		request1.put("title", "Sandeep");
		request1.put("Author", "Sran");
		
		
		baseURI = "http://localhost:3000/";
		given()
		       .body(request1.toJSONString())
		.when()
		       .post("/comments")
		.then()
		       .statusCode(201);	
	}
	@Test
	public void put1() {
		JSONObject request1 = new JSONObject();
		request1.put("title", "Sandeep");
		request1.put("Author", "Sran");
		
		
		baseURI = "http://localhost:3000/";
		given()
		       .body(request1.toJSONString())
		.when()
		       .put("/posts")
		.then()
		       .statusCode(200);	
	}
	
	
	}


