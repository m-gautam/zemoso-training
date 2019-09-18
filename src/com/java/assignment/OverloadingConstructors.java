/**
 * Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 **/
package com.java.assignment;

public class OverloadingConstructors {

    public OverloadingConstructors(){

    }

    public OverloadingConstructors(boolean a){
        this();
    }
}
