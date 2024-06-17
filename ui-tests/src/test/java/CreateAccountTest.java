import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountCreatedPage;
import pages.EditAccountInfoPage;
import pages.LoginPage;
import pages.MyAccountPage;

public class CreateAccountTest extends BaseTest {

    @Test()
    public void createNewAccountHappyPath() throws InterruptedException {
        User user = new User();
        String accountCreatedMessage = new LoginPage(driver).openPage().continueToCustomerRegistration().fillRegistrationFields(user).agreePrivacyPolicy().clickContinueBtn().accountCreatedMessage();
        Assert.assertEquals("Your Account Has Been Created!", accountCreatedMessage.trim(), "Expected and actual messages are not equals");
    }

    @Test()
    public void createNewAccountAndLogin() throws InterruptedException {
        User user = new User();
        AccountCreatedPage accountCreatedPage = new LoginPage(driver).openPage().continueToCustomerRegistration().fillRegistrationFields(user).agreePrivacyPolicy().clickContinueBtn();

        EditAccountInfoPage editAccountInfoPage = new MyAccountPage(driver).openPage().openProfileInfoEditor();

        String accountFirstName = editAccountInfoPage.getAccountFirstName();
        String accountLastName = editAccountInfoPage.getAccountLastName();
        String accountEmail = editAccountInfoPage.getAccountEmail();
        String accountPhone = editAccountInfoPage.getAccountPhone();

        SoftAssert softly = new SoftAssert();
        softly.assertEquals(user.getFirstName(), accountFirstName, "First name from UI and from user model are not equals");
        softly.assertEquals(user.getLastName(), accountLastName, "Last name from UI and from user model are not equals");
        softly.assertEquals(user.getEmail(), accountEmail, "Email from UI and from user model are not equals");
        softly.assertEquals(user.getPhoneNumber(), accountPhone, "Phone number from UI and from user model are not equals");
        softly.assertAll();
    }
}
