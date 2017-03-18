package service.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by albert on 13/03/2017.
 */
public class GooglePage {
    private WebElement q;

    @FindBy(how = How.CSS, using = "[name='q']")
    private WebElement searchBox;

    @FindBy(css = "[name='q']")
    @CacheLookup
    private WebElement sBox;

    public void searchGoogle(String text){
        q.sendKeys(text);
        q.submit();
    }

    public void searchGoogle2(String text){
        searchBox.sendKeys(text);
        searchBox.submit();
    }
//
//    public void searchGoogle3(String text){
//        sBox.sendKeys(text);
//        sBox.submit();
//    }
}
