package examples.users;


import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "classpath:examples/users/users.feature",
				tags = "~@ignore")// this will run all feature files except the ones tagged as @ignore
public class UsersRunner {
    // refer to https://github.com/intuit/karate#naming-conventions
    // for folder-structure recommendations and naming conventions

}