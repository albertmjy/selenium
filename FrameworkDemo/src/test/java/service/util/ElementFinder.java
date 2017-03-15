package service.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by albert on 12/03/2017.
 */
public class ElementFinder {

    public WebElement findElementByCss(WebDriver driver, String locator){
        WebElement element = driver.findElement(By.cssSelector(locator.trim()));
        return element;
    }
}
