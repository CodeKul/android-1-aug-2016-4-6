package com.codekul.generics;

/**
 * Created by aniruddha on 1/8/16.
 */
public class MyException extends RuntimeException{
    @Override
    public String toString() {
        return "UnIdentified Type";
    }

    @Override
    public String getMessage() {
        return "You should pass, String, Any, Thread or Button type";
    }
}
