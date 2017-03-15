package com.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by albert on 08/03/2017.
 */
public class ClassBTest {
    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("setup class b");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("teardown class b");
    }

    @Test
    public void testSayHi() throws Exception {
        System.out.println("say hi class b");
    }

    @Test
    public void testSayGoodbye() throws Exception {
        System.out.println("say goodbye class b");
    }

}