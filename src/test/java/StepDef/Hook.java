package StepDef;

import Base.BaseUtil;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends BaseUtil {
    String defaultBrowser ="ch";
    String defaultEnv = "qa";
    String url;
    String baseURL = System.getProperty("env");
    String browserType= System.getProperty("Browser");


    @Before
    public void openBrowser() {
        if(Strings.isNullOrEmpty(browserType)){
            browserType =defaultBrowser;
        }
        if(Strings.isNullOrEmpty(baseURL)){
            baseURL= defaultEnv;
        }
        driver = initDriver(browserType);
        switch (baseURL) {
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                break;
            case "cert":
                url = "http://cert.taltektc.com";
                break;
            case "prod":
                url = "http://taltektc.com";
                break;
        }
        driver.get(url);
    }
    @After
    public void tearDown(Scenario scenario){
        try{
            if (scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } finally {
            System.out.println("closing the browser");
            driver.quit();
        }
        }
}
