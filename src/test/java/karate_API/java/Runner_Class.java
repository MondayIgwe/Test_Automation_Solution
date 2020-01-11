package karate_API.java;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
//import com.intuit.karate.junit5.Karate;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "classpath:gorest_API_GET.feature",
               tags = "@smokeTest")

public class Runner_Class {

}



