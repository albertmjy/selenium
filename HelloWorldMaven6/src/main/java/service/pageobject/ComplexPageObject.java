package service.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by albert on 14/03/2017.
 */
public class ComplexPageObject {

    @FindBys({
            @FindBy(css = "xxx"),
            @FindBy(name = "xxx")
    })
    private List<WebElement> els;

    @FindAll({
            @FindBy(css = "abc"),
            @FindBy(xpath = "xyz")
    })
    private List<WebElement> elements;

    public ComplexPageObject(String someText, WebDriver driver){
        // ...
    }

}
