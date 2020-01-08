package API_Task_1;

import static io.restassured.RestAssured.*;
import java.io.FileNotFoundException;
import org.testng.annotations.*;

import com.studentapp.testbase.TestBase;

public class get_AllDogsBreeds extends TestBase{

	//private static Logger log = LogManager.getLogger(get_AllDogsBreeds.class.getName());

    
    @Test
    public void getAllDogBreed_Diagram_1() throws FileNotFoundException{
  	
    //log.info(baseURI = prop.getProperty("HOST"));
    given() 
	     	.param("Content-Type","application/json")
	     	.param("Access-Control-Allow-Origin","*")
	        .cookie("__cfduid","d83a1cf97e49d083e0d72e1cce03db8c21574413022")        
    .when()
            .get("/breeds/list/all")
    .then().assertThat().statusCode(200).log().all(); 
    }
    
}
