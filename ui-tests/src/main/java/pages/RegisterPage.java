package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends AbstractPage{
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
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement agreePrivacyPolicy;

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public RegisterPage openPage() {
        driver.navigate().to(ProjectData.REGISTER_PAGE.getUrl());
        return this;
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }
}
