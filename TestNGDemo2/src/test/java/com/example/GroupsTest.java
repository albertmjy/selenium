package com.example;

import org.testng.annotations.Test;

/**
 * Created by albert on 08/03/2017.
 */
public class GroupsTest {

    @Test(groups = {"unittest", "functest"})
    public void testA(){
        System.out.println("Group test -> test A");
    }

    @Test(groups = {"functest"})
    public void testB(){
        System.out.println("Group test -> test B");
    }

    @Test(groups = {"unittest"})
    public void testC(){
        System.out.println("Group test -> test C");
    }
}
