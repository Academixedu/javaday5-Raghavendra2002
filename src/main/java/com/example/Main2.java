package com.example;

/**
 * Main2
 */
public class Main2 {

    public static void main(String[] args){

        int a,b,c;

        a=10;
        b=5;
        c=sum(a,b);

        System.out.println(c);

        String name="Raghavendra";

        greetMethod(name);

    }

    public static void greetMethod(String name){

        System.out.println("hello "+name);

    }

    public static int sum(int a,int b){

        return a+b;
    }
}