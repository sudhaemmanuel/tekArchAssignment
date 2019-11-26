package RestApiAssignment1;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jayway.restassured.path.json.JsonPath;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class getStudentInfo {

	public static void main(String[] args) throws Exception {
		
 String json= "[{\r\n" + 
 		"			 \"username\":\"aa@m.com\",\r\n" + 
 		"			 \"password\":\"12xyz\",\r\n" + 
 		"			 \"sessionid\":[12,23,34,56],\r\n" + 
 		"			 \"students\": [\r\n" + 
 		"			 {\r\n" + 
 		"			 \"id\": 112,\r\n" + 
 		"			 \"name\": \"aana\",\r\n" + 
 		"			 \"marks\":[20,25,22],\r\n" + 
 		"			 \"contact\": [\"1234\",\"3456\"],\r\n" + 
 		"			 \"adresss\":[{\"state\":\"nc\",\"city\":\"abc\"},{\"state\":\"ca\",\"city\":\"xyz\"}]\r\n" + 
 		"			 },\r\n" + 
 		"			 {\r\n" + 
 		"			 \"id\": 115,\r\n" + 
 		"			 \"name\": \"banu\",\r\n" + 
 		"			 \"marks\":[20,25,22],\r\n" + 
 		"			 \"contact\": [\"4534\",\"3456\"],\r\n" + 
 		"			 \"adresss\":[{\"state\":\"nc\",\"city\":\"abc\"},{\"state\":\"ca\",\"city\":\"xyz\"}]\r\n" + 
 		"			 }]";
	

ObjectMapper mapper = new ObjectMapper();// object mapper is used to deserilize json
//// string into java objects.
ObjectNode node = mapper.createObjectNode();
JsonNode tree = mapper.readTree(json);

JsonPath path=new JsonPath(json);

Map<String,String> map= path.getMap("$");
for (Map.Entry<String,String> entry : map.entrySet())  
    System.out.println("Key = " + entry.getKey() + 
                     ", Value = " + entry.getValue()); 
 
	}
}
//Set<String>mapSet=map.keySet();
//for(String s:mapSet){
//		node.set(s, tree.get(s).get("username"));
//	if(tree.get(s).get("username").asText().contains("aa@m.com")){
//			System.out.println(tree.get(s).get("username"));
	

/*public class JacksonMapExample1 {
	 public static void main(String[] args) {
	 ObjectMapper mapper = new ObjectMapper();
	 String json = "{\"name\":\"mkyong\", \"age\":\"37\"}";
	 try {
	 // convert JSON string to Map
	 Map<String, String> map = mapper.readValue(json, Map.class);
	// it works
	 //Map<String, String> map = mapper.readValue(json, new TypeReference<Map<String,
	String>>() {});
	 System.out.println(map);
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	 }
	}
	*/





  

	
		
	
 
 




