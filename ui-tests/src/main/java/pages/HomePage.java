package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//*[@id='widget-navbar-217834']//*[contains(text(),'My account')]")
    private WebElement myAccountBtn;



    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public HomePage openPage() {
        driver.navigate().to(ProjectData.HOME_PAGE.getUrl());
        return this;
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }
}
