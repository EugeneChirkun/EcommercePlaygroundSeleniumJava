package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountInfoPage extends AbstractPage {
    @FindBy(name = "firstname")
    private WebElement firstName;
    @FindBy(name = "lastname")
    private WebElement lastName;
    @FindBy(name = "email")
    private WebElement email;
    @FindBy(name = "telephone")
    private WebElement phone;
    @FindBy(xpath = "//div[@class='float-left']")
    private WebElement backBtn;
    @FindBy(xpath = "//div[@class='float-right']")
    private WebElement continueBtn;

    public EditAccountInfoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String getAccountFirstName() {
        return firstName.getAttribute("value");
    }

    public String getAccountLastName() {
        return lastName.getAttribute("value");
    }

    public String getAccountPhone() {
        return phone.getAttribute("value");
    }

    public String getAccountEmail() {
        return email.getAttribute("value");
    }

    @Override
    public EditAccountInfoPage openPage() {
        driver.navigate().to(ProjectData.EDIT_ACCOUNT_INFO_PAGE.getUrl());
        return this;
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }
}
