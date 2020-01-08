package API_Task_1;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.*;


public class verifyRetriever_Breed {
	  
    
    @Test
    public void verifyRetriever_Breed_Diagram_2(){
   
    	String verifyRetrieverString = "retriever";
    	baseURI = "https://dog.ceo/api";
    	given() 
	     	.param("Content-Type","application/json")
	     	.param("Access-Control-Allow-Origin","*")
	        .cookie("__cfduid","d83a1cf97e49d083e0d72e1cce03db8c21574413022")        
	    .when()
            .get("/breeds/list")
            .then().assertThat().statusCode(200).and()
            .body("message[70]",containsString(verifyRetrieverString));
    		 System.out.println("Verify - "+verifyRetrieverString+" "+"is within the list");
    }
    
   
}
