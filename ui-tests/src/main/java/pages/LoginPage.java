package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
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
