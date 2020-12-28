package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BaseUtil {
    public static WebDriver driver;

    public static WebDriver initDriver(String driverType) {
        choseBrowser (driverType);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        return driver;
    }

    //driver setup using WebDriver Manager -- bonigarcia
    private static void choseBrowser(String driverType) {
        if(driverType.equalsIgnoreCase("ch")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("ff")){
            WebDriverManager.firefoxdriver().setup();;
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("safari")) {
            DriverManagerType safari = DriverManagerType.SAFARI;
            WebDriverManager.getInstance(safari).setup();
            driver = new SafariDriver();
        }
    }

}
