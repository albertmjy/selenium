package service.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import service.controls.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by albert on 12/03/2017.
 */
public class BaseScript {
    private WebDriver driver;

    private Map<String, Properties> propertiesMap; // in case multiple properties
    protected Properties uiMapProperties;

    protected void open(String url){
        driver = new ChromeDriver();
        driver.get(url);
    }

    protected Textbox textbox(String locator){
        Textbox textbox = new Textbox(driver, locator);
        return textbox;
    }

    protected Textbox textboxV2(String name){
        String locator = uiMapProperties.getProperty(name);
        Textbox textbox = new Textbox(driver, locator);
//            textbox = newInstance(locator, Textbox.class);
        return textbox;
    }

    protected Tab tab(String locator){
        Tab tab = new Tab(driver, locator);
        return tab;
    }

    protected Radio radio(String locator){
        Radio radio = new Radio(driver, locator);
        return radio;
    }

    protected Button buttonV2(String name){
        String elementLocator = uiMapProperties.getProperty(name).trim();
        Button button = new Button(driver, elementLocator);
        return button;
    }
    protected Element elementV2(String name){
        String elementLocator = uiMapProperties.getProperty(name).trim();
        Element element = new Element(driver, elementLocator);
        return element;
    }

    protected void loadUIMap(String name){
        this.uiMapProperties = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("HomePage.properties");
        try {
            uiMapProperties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> T newInstance(String locator, Class<T> cls){
        try {
            T t =cls.getConstructor(WebDriver.class, String.class).newInstance(driver, locator);
            return t;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }
}
