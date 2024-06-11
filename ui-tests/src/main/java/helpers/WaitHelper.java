package helpers;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Pattern;

@UtilityClass
public class WaitHelper {
    private static final int timeToWait = 10;

    public static void waitForTextToAppear(WebDriver driver, String textToAppear, WebElement element) {
        new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
    }

    public static void waitForElementClickable(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.elementToBeClickable(element));

    }

    public static WebElement waitForElementLocatedBy(By by, WebDriver driver) {
        return new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void waitElementWithTextPresence(WebDriver driver, By by, String pattern) {
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        wait.until(ExpectedConditions.textMatches(by, Pattern.compile(pattern)));
    }
}
