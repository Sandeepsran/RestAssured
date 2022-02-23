import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test11_Get {

	
	@Test
	public void test11() {
		
		given()
		       .get("https://reqres.in/api/users?page=2")
		.then()
		       .statusCode(200)
		       .log().all()
		       .body("data.id[0]", equalTo(7))
		       .body("data.id[2]", equalTo(9));
		
	}
}
