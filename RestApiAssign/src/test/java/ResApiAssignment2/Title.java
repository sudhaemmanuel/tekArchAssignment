package ResApiAssignment2;

import com.jayway.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jayway.restassured.path.json.JsonPath;
import static com.jayway.restassured.RestAssured.*;

public class Title {
    @Test 
	public  void getUserId() throws ParseException {
    	//SoftAssert softAssert=new SoftAssert();
    	//String expectedStatus="7";

    
    String resp= given()
    	.when()
    	.get("https://jsonplaceholder.typicode.com/posts")
    	
    	.then()
    	//.contentType(ContentType.JSON)
    	.extract().response().asString();
        System.out.println(resp);
    	
        JSONParser parse = new JSONParser(); 
        JSONObject jobj = (JSONObject)parse.parse(resp); 
        JSONObject posts =  (JSONObject) jobj.get("UserId");
        System.out.println(posts);
        
    
//        JSONObject jo = new JSONObject(jsonString); //
//        JSONArray ja = jo.getJSONArray("id_list"); // get the JSONArray
//        List<String> keys = new ArrayList<>();
//        for(int i=0;i<ja.length();i++){
//         keys.add(ja.getString(i)); // iterate the JSONArray and extract the keys
//        }
//        return keys;
        }   
      }









