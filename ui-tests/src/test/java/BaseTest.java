import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod
    protected void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod
    protected void stopBrowser() {
        DriverSingleton.closeWebDriver();
    }
}
