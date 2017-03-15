package service.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import service.util.RerportStatus;

import java.util.Properties;

/**
 * Created by albert on 12/03/2017.
 */
public class Textbox extends Element {

    public Textbox(WebDriver driver,  String locator){
        super(driver, locator);
    }

    public Textbox edit(String text){
        report("Action: edit, " + locator, RerportStatus.LOG);
        findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element.sendKeys(Keys.TAB);
        return this;
    }

}
