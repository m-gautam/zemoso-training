/**
 * Create a class with a constructor that takes a String argument. During construction, print the argument.
 * Create an array of object references to this class, but don’t actually create objects to assign into the array.
 * When you run the program, notice whether the initialization messages from the constructor calls are printed.
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 */

package com.java.assignment;

public class ArrayObject {

    private ArrayObject(String s) {
        System.out.println("argument is " + s);
    }

    public static void main(String[] args){
        ArrayObject[] obj = new ArrayObject[2];
        obj[0] = new ArrayObject("hello");
    }
}
