package com.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by albert on 08/03/2017.
 */
public class ClassATest {

    ClassA classA;
    @BeforeMethod
    public void setUp() throws Exception {
        this.classA = new ClassA("Albert");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        // clean all
    }

    @Test
    public void testSayHi() throws Exception {
        classA.sayHi();
    }

    @Test
    public void testGoodBye() throws Exception {
        classA.goodBye();

    }

}