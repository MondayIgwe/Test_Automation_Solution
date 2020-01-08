package API_Task_1;

import static io.restassured.RestAssured.*;
import org.testng.annotations.*;

public class verifySub_Breed {
	

    
    @Test
    public void verifySub_Breed_Diagram_3(){
  	
    baseURI = "https://dog.ceo/api";
    given() 
	     	.param("Content-Type","application/json")
	     	.param("Access-Control-Allow-Origin","*")
	        .cookie("__cfduid","d83a1cf97e49d083e0d72e1cce03db8c21574413022")        
    .when()
            .get("/breed/retriever/list")
    .then().assertThat().statusCode(200).and().log().all();
    }

    
  }
