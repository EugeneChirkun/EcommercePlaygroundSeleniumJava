import org.testng.annotations.Test;
import pages.LoginPage;

public class CreateAccountTest extends BaseTest{

    @Test()
    public void createNewAccountHappyPath() {
        LoginPage loginPage = new LoginPage(driver);
    }

}
