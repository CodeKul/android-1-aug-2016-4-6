package com.codekul.android52.innerclass;

/**
 * Created by aniruddha on 1/8/16.
 */
public class Main {

    public static void main(String[] args) {

        Outer outer =
                new Outer();
        Outer.SimpleInner simpleInner =
                outer.new SimpleInner();

        Outer.StaticInner staticInner =
                new Outer.StaticInner();
        outer.method();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // i m happy till java 7
            }
        };

        runnable = () -> {
            System.out.println("Hello"); // lambdas
        };

        runnable = Main::hello; // method references
    }

    private static void hello (){
        System.out.println("Method references");
    }
}
