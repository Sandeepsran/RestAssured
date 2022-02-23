package LocalServer111;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Test_Get {

	@Test
	public void test1() {
		baseURI = "http://localhost:3000/";
		given()
		.get("/posts")
		.then()
		.statusCode(200);
	}
	
	
}
