package lib.keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

/**
 * Created by albert on 11/03/2017.
 */
public class HomePage implements HomePageInterface{

    private WebDriver driver;

    public void Open_Browser(String locator, String path, String url) {
        log("Act: Open_Browser,  " + locator + ", " + path + ", " + url);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }

    public void Select_FlightTicketTab(String locator, String path, String param) {
        log("Act: Select_FlightTicketTab,  " + param);
    }

    public void Select_DomesticFlightTab(String locator, String path, String param) {
        log("Act: Select_DomesticFlightTab,  " + param);
    }

    public void Select_RoundTripRadioButton(String locator, String path, String param) {
        log("Act: Select_RoundTripRadioButton,  " + param);
    }

    public void Edit_TravelFromText(String locator, String path, String text) {
        log("Act: Edit_TravelFromText,  " + text);
    }

    public void Edit_TravelToText(String locator, String path, String text) {
        log("Act: Edit_TravelToText,  " + text);
    }

    public void Edit_DateFromText(String locator, String path, String date) {
        log("Act: Edit_DateFromText,  " + date);
    }

    public void Edit_DateToText(String locator, String path, String date) {
        log("Act: Edit_DateToText,  "  + date);
    }

    public void Click_SearchButton(String locator, String path, String param) {
        log("Act: Click_SearchButton,  " + param);
    }
    public void quitDriver(){
        log("Act: quitDriver,  " );
    }

    private void log(String s){
        System.out.println(s);
        Reporter.log(s);
    }
}
