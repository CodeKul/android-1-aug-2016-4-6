package com.codekul.generics;

import java.awt.*;

/**
 * Created by aniruddha on 1/8/16.
 */
public class Any extends Object{

    // father of every class in java is Object
    private Object anything ;

    public Any (){

        anything = new String ();
        anything = new Button();
        anything = new Thread();
        anything = new Any();
    }

    public void getMeType(Object anything){
        if(anything instanceof Any){
            Any any = (Any) anything;
        }
        else if (anything instanceof String){
            String str = (String) anything;
        }
        else if(anything instanceof Thread){
            Thread thread = (Thread) anything;
        }
        else if(anything instanceof Button){
            Button btn = (Button) anything;
            //down casting
        }
        else {
            throw new MyException();
        }
    }
}
