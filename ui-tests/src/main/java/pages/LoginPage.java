package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.WaitHelper.waitForElementClickable;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    private WebElement continueBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public RegistrationPage continueToCustomerRegistration() {
        waitForElementClickable(driver, continueBtn);
        continueBtn.click();
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
