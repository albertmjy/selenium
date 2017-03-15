package service.controls;

import org.openqa.selenium.WebDriver;

/**
 * Created by albert on 12/03/2017.
 */
public class Radio extends Element {
    public Radio(WebDriver driver, String locator){
        super(driver, locator);
    }

    public void select(){
        this.click();
    }
}
