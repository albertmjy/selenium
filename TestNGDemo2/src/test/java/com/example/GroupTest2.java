package com.example;

import org.testng.annotations.Test;

/**
 * Created by albert on 08/03/2017.
 */
public class GroupTest2 {
    @Test(groups = {"linux.unit"})
    public void linuxTestA(){
        System.out.println("Linux test A");
    }

    @Test(groups = {"linux.func"})
    public void linuxTestB(){
        System.out.println("Linux test B");
    }

    @Test(groups = {"windows.unit"})
    public void windowsTestA(){
        System.out.println("Windows test A");
    }

    @Test(groups = {"windows.unit"})
    public void windowsTestB(){
        System.out.println("Windows test B");
    }
}
