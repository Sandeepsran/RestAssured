import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Test02_Post {

	@Test
	public void test02post() {
	Map<String , Object> map= new HashMap<String , Object>();
	
	
	map.put("name", "Sandeep");
	map.put("job", "tech");
	JSONObject req = new JSONObject(map);
	System.out.println(req);
	
	given().
	   body(req.toJSONString()).
	  when().
	   post("https://reqres.in/api/users").
	   then().
	   statusCode(201);
	
	}
	

}
