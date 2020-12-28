import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/Features",
        plugin = {
                "json:target/cucumber.json",
        },
        glue = "StepDef"
)

public class TestRunner  extends AbstractTestNGCucumberTests {

}
