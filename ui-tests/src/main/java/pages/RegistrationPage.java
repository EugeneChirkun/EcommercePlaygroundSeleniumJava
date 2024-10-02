package pages;

import lombok.extern.log4j.Log4j2;
import model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class RegistrationPage extends AbstractPage {
    @FindBy(xpath = "//*[@name='firstname']")
    private WebElement firstName;
    @FindBy(xpath = "//*[@name='lastname']")
    private WebElement lastName;
    @FindBy(xpath = "//*[@name='email']")
    private WebElement email;
    @FindBy(xpath = "//*[@name='telephone']")
    private WebElement phone;
    @FindBy(xpath = "//*[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//*[@name='confirm']")
    private WebElement passwordConfirm;
    @FindBy(xpath = "//*[@id='input-newsletter-yes']")
    private WebElement newsletterRadioYes;
    @FindBy(xpath = "//*[@id='input-newsletter-no']")
    private WebElement newsletterRadioNo;
    @FindBy(xpath = "//div[@class='custom-control custom-checkbox custom-control-inline']")
    private WebElement agreePrivacyPolicy;
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueBtn;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public RegistrationPage fillRegistrationFields(User user) {
        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        email.sendKeys(user.getEmail());
        phone.sendKeys(user.getPhoneNumber());
        password.sendKeys(user.getPassword());
        passwordConfirm.sendKeys(user.getPassword());
        log.info("---> Registering new user " + user.getFirstName() + " " + user.getLastName() +" with email " + user.getEmail());
        return new RegistrationPage(driver);
    }

    public RegistrationPage agreePrivacyPolicy() {
        agreePrivacyPolicy.click();
        log.info("---> Proceeding to the Registration page");
        return new RegistrationPage(driver);
    }

    public AccountCreatedPage clickContinueBtn() {
        continueBtn.click();
        log.info("---> Proceeding to Account creation confirmation page");
        return new AccountCreatedPage(driver);
    }

    @Override
    public RegistrationPage openPage() {
        driver.navigate().to(ProjectData.REGISTER_PAGE.getUrl());
        return this;
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }
}
