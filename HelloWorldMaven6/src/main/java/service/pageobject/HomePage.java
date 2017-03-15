package service.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by albert on 03/03/2017.
 */
public class HomePage {
    private WebDriver driver;

    private String radioRoundTrip = "#js_flight_domestic_searchbox > div.crl_group:first-of-type .lal_rdo:last-of-type";
    private String textTravelFrom = "form#js_flight_domestic_searchbox div.iwrap .crl_sp2_1>.controls:first-of-type input";
    private String textTravelTo = "form#js_flight_domestic_searchbox div.iwrap .crl_sp2_1>.controls:last-of-type input";
    private String textDateFrom = "form#js_flight_domestic_searchbox div.iwrap .crl_sp2_2>.controls:first-of-type input";
    private String textDateTo = "form#js_flight_domestic_searchbox div.iwrap .crl_sp2_2>.controls.js_arrivalDateDiv input";
    private String btnSubmit = "#js_flight_domestic_searchbox .button-search";


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getRadioRoundTrip(){
        return driver.findElement(By.cssSelector(radioRoundTrip));
    }

    public WebElement getTextTravelFrom(){
        return driver.findElement(By.cssSelector(textTravelFrom));
    }

    public WebElement getTextTravelTo(){
        return driver.findElement(By.cssSelector(textTravelTo));
    }

    public WebElement getTextDateFrom(){
        return driver.findElement(By.cssSelector(textDateFrom));
    }

    public WebElement getTextDateTo(){
        return driver.findElement(By.cssSelector(textDateTo));
    }

    public WebElement getBtnSubmit(){
        return driver.findElement(By.cssSelector(btnSubmit));
    }
}
