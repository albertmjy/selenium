package service.controls;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import service.util.ElementFinder;
import service.util.ElementSync;
import service.util.MyReporter;
import service.util.RerportStatus;

import java.util.Properties;

/**
 * Created by albert on 12/03/2017.
 */
public class Element {

    private WebDriver driver;
    public String locator;
    public Properties UIMapProperties;

    String elementStruct; // if element is camplicate enough


    WebElement element;

    ElementFinder elementFinder = new ElementFinder();
    MyReporter reporter = new MyReporter();
    ElementSync elementSync = new ElementSync();

//    public Element(WebDriver driver){
//        this.driver = driver;
//    }
//
//    public Element(WebDriver driver, Properties UIMapProperties, String name){
//        this.driver = driver;
//        this.UIMapProperties = UIMapProperties;
//    }

    public Element(WebDriver driver, String locator){
        this.driver = driver;
        this.locator = locator;
    }

    public Element click(){
        report("Action: Click");
        findElement(locator);
        element.click();

        return this;
    }

    public Element sendTab(){
        element.sendKeys(Keys.TAB);
        return this;
    }

    void scrollTo(){

    }

    void mouseOver(){

    }

    protected void report(String s){
        reporter.log(s);
    }
    protected void report(String s, RerportStatus status){
        switch (status){
            case Fail:
                reporter.fail(s);break;
            case PASS:
                reporter.pass(s);break;
            case WARNING:
                reporter.warning(s);break;
            case LOG:
                reporter.log(s);break;
        }
    }

    public Element findElement(String localor){
        this.element = elementFinder.findElementByCss(driver, localor);

        return this;
    }

    public Element visibilitySyncByLocator(String locator, int timeoutSec){
        elementSync.visiblilitySync(driver, locator, timeoutSec);

        return this;
    }

    public Element visibilitySync(Element element, int timeoutSec){
        elementSync.visiblilitySync(driver, element.locator, timeoutSec);

        return this;
    }

}
