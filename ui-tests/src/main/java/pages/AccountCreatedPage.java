package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class AccountCreatedPage extends AbstractPage {
    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    private WebElement continueBtn;
    @FindBy(xpath = "//h1[@class='page-title my-3']")
    private WebElement successMessage;

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String accountCreatedMessage() {
        log.info("---> Account successfully created with message " + successMessage.getText());
        return successMessage.getText();
    }

    @Override
    public AccountCreatedPage openPage() {
        driver.navigate().to(ProjectData.ACCOUNT_CREATED_PAGE.getUrl());
        return this;
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }
}
