package com.example;

/**
 * Created by albert on 08/03/2017.
 */
public class ClassA {

    private String name;

    public ClassA(String name){
        this.name = name;
    }

    public void sayHi(){
        System.out.println("Hello there!");
    }

    public void goodBye(){
        System.out.println("Good Bye! " + this.name);
    }
}
