import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountCreatedPage;
import pages.LoginPage;

public class CreateAccountTest extends BaseTest {

    @Test()
    public void createNewAccountHappyPath() throws InterruptedException {
        User user = new User();
        String accountCreatedMessage = new LoginPage(driver)
                .openPage()
                .continueToCustomerRegistration()
                .fillRegistrationFields(user)
                .agreePrivacyPolicy()
                .clickContinueBtn()
                .accountCreatedMessage();
        Assert.assertEquals("Your Account Has Been Created!", accountCreatedMessage.trim());
    }

    @Test()
    public void createNewAccountAndLogin() throws InterruptedException {
        User user = new User();
        AccountCreatedPage accountCreatedPage = new LoginPage(driver)
                .openPage()
                .continueToCustomerRegistration()
                .fillRegistrationFields(user)
                .agreePrivacyPolicy()
                .clickContinueBtn();



    }

}
