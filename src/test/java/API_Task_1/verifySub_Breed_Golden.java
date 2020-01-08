package API_Task_1;


import static io.restassured.RestAssured.*;
import org.testng.annotations.*;
import io.restassured.http.ContentType;


public class verifySub_Breed_Golden {
   
    
   @Test
    public void verifySub_Breed_Golden_Diagram_4(){

    baseURI = "https://dog.ceo/api";
    given()
	     	.param("Access-Control-Allow-Origin","*")
	        .cookie("__cfduid","d83a1cf97e49d083e0d72e1cce03db8c21574413022")        
    .when()
            .get("breeds/image/random")
    .then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();

    }
}
