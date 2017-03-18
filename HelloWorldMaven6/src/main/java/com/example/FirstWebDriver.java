package com.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

/**
 * Created by albert on 05/03/2017.
 */
public class FirstWebDriver {
    public void basicDemo() throws InterruptedException{
        // pre-config
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        // start
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com");

        // radio button
        WebElement radioRoundTrip = driver.findElement(By.cssSelector("#js_flight_domestic_searchbox > div.crl_group:first-of-type .lal_rdo:last-of-type"));
        radioRoundTrip.click();

        // travel from
        WebElement textFrom = driver.findElement(By.cssSelector("form#js_flight_domestic_searchbox div.iwrap .crl_sp2_1>.controls:first-of-type input"));
        textFrom.click();
        textFrom.sendKeys("shanghai");
        Thread.sleep(2000);
        textFrom.sendKeys(Keys.TAB);

        // travel to
        WebElement textTo = driver.findElement(By.cssSelector("form#js_flight_domestic_searchbox div.iwrap .crl_sp2_1>.controls:last-of-type input"));
        textTo.click();
        textTo.sendKeys("chengdu");
        Thread.sleep(2000);
        textTo.sendKeys(Keys.TAB);

        // date from
        WebElement textDateFrom = driver.findElement(By.cssSelector("form#js_flight_domestic_searchbox div.iwrap .crl_sp2_2>.controls:first-of-type input"));
        textDateFrom.clear();
        textDateFrom.sendKeys("2017-04-05");
        Thread.sleep(2000);
        textDateFrom.sendKeys(Keys.TAB);

        // date to
        WebElement textDateTo = driver.findElement(By.cssSelector("form#js_flight_domestic_searchbox div.iwrap .crl_sp2_2>.controls.js_arrivalDateDiv input"));


        textDateTo.clear();
        textDateTo.sendKeys("2017-05-01");
        Thread.sleep(2000);
        textDateTo.sendKeys(Keys.TAB);

        // Click submit
        WebElement btnSubmit = driver.findElement(By.cssSelector("#js_flight_domestic_searchbox .button-search"));
        btnSubmit.click();

        // click the tab
//        WebElement tab = driver.findElement(By.cssSelector("#js_inter_tab"));
//        tab.click();
//        driver.quit();
    }

    public void withCookies(){
        // pre-config
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        // start
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com");

        // add cookie
        Cookie cookie = new Cookie("passwordd", "1234567890");
        driver.manage().addCookie(cookie);

        // get all cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println(allCookies.isEmpty());
        for(Cookie cook: allCookies){
            System.out.println(cook.getName() + ": " + cook.getValue());
        }

        // delete cookie
        driver.manage().deleteCookieNamed("QN1");
        driver.manage().deleteCookie(cookie);
        driver.manage().deleteAllCookies();

    }

    public void syncDemo() {
        // pre-config
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        // start
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com");

        // radio button
        WebElement radioRoundTrip = driver.findElement(By.cssSelector("#js_flight_domestic_searchbox > div.crl_group:first-of-type .lal_rdo:last-of-type"));
        radioRoundTrip.click();

        // travel from
        WebElement textFrom = driver.findElement(By.cssSelector("form#js_flight_domestic_searchbox div.iwrap .crl_sp2_1>.controls:first-of-type input"));
        textFrom.click();
        textFrom.sendKeys("shanghai");
        // wait for element presents, 10sec in max
        WebElement suggestionBox = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.q-suggest")));
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.q-suggest")));
        textFrom.sendKeys(Keys.TAB);

        // travel to
        WebElement textTo = driver.findElement(By.cssSelector("form#js_flight_domestic_searchbox div.iwrap .crl_sp2_1>.controls:last-of-type input"));
        textTo.click();
        textTo.sendKeys("chengdu");
        // findelements get(2)
        WebElement suggestionBox2 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector("div.q-suggest")).get(1)));
        textTo.sendKeys(Keys.TAB);

    }

    public void actionsDemo() throws InterruptedException {
        // pre-config
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        // start
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com");

        // radio button
        WebElement radioRoundTrip = driver.findElement(By.cssSelector("#js_flight_domestic_searchbox > div.crl_group:first-of-type .lal_rdo:last-of-type"));
        radioRoundTrip.click();

        WebElement textFrom = driver.findElement(By.cssSelector("form#js_flight_domestic_searchbox div.iwrap .crl_sp2_1>.controls:first-of-type input"));
        textFrom.click();

        // float pane
        WebElement ABCDE = driver.findElement(By.cssSelector("span[data-key='ABCDE']"));
        ABCDE.click();
        WebElement FGHJ = driver.findElement(By.cssSelector("span[data-key='FGHJ']"));
        FGHJ.click();
        WebElement KLMNP = driver.findElement(By.cssSelector("span[data-key='KLMNP']"));
        KLMNP.click();
        WebElement QRSTW = driver.findElement(By.cssSelector("span[data-key='QRSTW']"));
        QRSTW.click();
        WebElement XYZ = driver.findElement(By.cssSelector("span[data-key='XYZ']"));
        XYZ.click();
        WebElement domesticfrom = driver.findElement(By.cssSelector("span[data-key='domesticfrom']"));
        domesticfrom.click();

        // city
        WebElement beijing = driver.findElement(By.cssSelector("a[data-code='BJS']"));
        WebElement chengdu = driver.findElement(By.cssSelector("a[data-code='CTU']"));
        WebElement kunming = driver.findElement(By.cssSelector("a[data-code='KMG']"));
        WebElement guiyang = driver.findElement(By.cssSelector("a[data-code='KWE']"));
//        beijing.click();

        Actions actions = new Actions(driver);
        actions.moveToElement(beijing);
        actions.perform();
        Thread.sleep(2000);
        actions.moveToElement(chengdu);
        actions.perform();
        Thread.sleep(2000);
        actions.moveToElement(kunming);
        actions.perform();
        Thread.sleep(2000);
        actions.moveToElement(guiyang);
        actions.perform();

    }

}
