package com.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.base.BaseScript;

import service.util.RerportStatus;

/**
 * Created by albert on 12/03/2017.
 */
public class TestScript extends BaseScript{

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");
        loadUIMap("HomePage.properties");
    }

    @Test
    public void run(){
        open("http://www.qunar.com");
        tab("#js_nva_cgy li.first").click();
        tab("#js_domestic_tab").click();
        radio("#js_flight_domestic_searchbox > div.crl_group:first-of-type .lal_rdo:last-of-type").click();

        textbox("form#js_flight_domestic_searchbox div.iwrap .crl_sp2_1>.controls:first-of-type input").edit("shanghai");


        textboxV2("text.travelTo").edit("chengdu");
        textboxV2("text.dateFrom").edit("2017-04-05");
        textboxV2("text.dateTo").edit("2017-05-01");
        buttonV2("btn.submit").click();


    }


}
