package service.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by albert on 12/03/2017.
 */
public class ElementSync {
    public void visiblilitySync(WebDriver driver, String locator, int timeoutSec){
        WebElement suggestionBox = (new WebDriverWait(driver, timeoutSec))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public void presenceSync(WebDriver driver, String locator, int timeoutSec){
        WebElement suggestionBox = (new WebDriverWait(driver, timeoutSec))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
    }

    public void enableSync(WebDriver driver, String locator, int timeoutSec){
        // ...
    }

    // all sync methods
}
