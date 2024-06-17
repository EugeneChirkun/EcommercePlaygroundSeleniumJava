package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends AbstractPage{
    @FindBy(xpath = "//i[contains(@class,'fa-user-edit')]")
    private WebElement editAccountInfoBtn;

    public EditAccountInfoPage openProfileInfoEditor() {
        editAccountInfoBtn.click();
        return new EditAccountInfoPage(driver);
    }
    public MyAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public MyAccountPage openPage() {
        driver.navigate().to(ProjectData.MY_ACCOUNT_PAGE.getUrl());
        return this;
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }
}
