package ResApiAssignment2;

import com.jayway.restassured.response.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
import static org.testng.Assert.assertEquals;

public class Title {
    @Test 
	public  void getUserId() throws ParseException {
    	//SoftAssert softassert=new SoftAssert();
        //int expected= 7;

    
    Response resp= given()
    	.when()
    	.get("https://jsonplaceholder.typicode.com/posts")
    	
    	.then()
    	.contentType("application/json")
    	.extract().response();
     
       //String body= resp.getBody().asString();
       //System.out.println(body);
      
       
   List< HashMap<String, String>> jsonresp= resp.jsonPath().get("$");
   for (int i =0; i<jsonresp.size();i++) {
	   
	   String userid = String.valueOf(jsonresp.get(i).get("userId"));
	   System.out.println(userid);
	  // softassert.assertEquals(userid, expected);
	   if (userid.contentEquals("7")) 
		   System.out.println(jsonresp.get(i).get("title"));
	
	   }
    }
}
   
   
   
   
   
//   for (Map.Entry<String, String> entry:jsonresp.entrySet())
//    System.out.println("Key = " + entry.getKey() + 
 //                                ", Value = " + entry.getValue());
    
    
    








