package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.WaitHelper.waitForElementClickable;

@Log4j2
public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    private WebElement continueBtn;

    @FindBy(id = "input-email")
    private WebElement emailField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public RegistrationPage continueToCustomerRegistration() {
        waitForElementClickable(driver, continueBtn);
        continueBtn.click();
        log.info("---> Proceeding to Customer registration");
        return new RegistrationPage(driver);
    }

    @Override
    public LoginPage openPage() {
        driver.navigate().to(ProjectData.LOGIN_PAGE.getUrl());
        return this;
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }
}
