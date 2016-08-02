package com.codekul.generics;

import java.awt.*;

/**
 * Created by aniruddha on 1/8/16.
 */
public class Main {

    public static void main(String[] args) {

    }

    public static void beforeGenerics(){
        Any any = new Any();
        any.getMeType(new String());
        any.getMeType(new Thread());
        any.getMeType(new Button());
        any.getMeType(new Any());
        any.getMeType(new StringBuilder());
    }

    public static void fromGenerics(){

        Global<String> glbStr =
                new Global<>();
        glbStr.setAnything("Hello");

        String any = glbStr.getAnything();
        System.out.println("Any - "+any);

        Global<Button> gblBtn = new Global<>();
        gblBtn.setAnything(new Button());
        Button btn = gblBtn.getAnything();
    }
}
