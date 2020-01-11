package karate_API.java;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.KarateOptions;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.Assert.*;

import com.intuit.karate.formats.selenium.TestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

@KarateOptions(tags = "@RegressionTest")
public class TestParallel_Class {

    @BeforeClass
    public static void beforeClass() throws Exception {
       // TestBase.beforeClass();
    }

    //@Test
    public void testSelected() {
        List<String> tags = Arrays.asList("~@ignore","@Regression","smokeTest");
        List<String> features = Arrays.asList("classpath:demo/cats");
        String karateOutputPath = "target/surefire-reports";
        Results results = Runner.parallel(tags, features, 5, karateOutputPath);
        //DemoTestParallel.generateReport(karateOutputPath);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }

    @Test
    public void test_In_Parallel(){
        Results results = Runner.parallel(getClass(), 1,"target/surefire-reports");
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
}
