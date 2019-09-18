/**
 * Using the documentation for java.util.regex.Pattern as a resource,
 * write and test a regular expression that checks a sentence to see that
 * it begins with a capital letter and ends with a period.
 *
 * Author : Gautam Meena
 *  Date : 19 September 2019
 **/
package com.java.assignment;

import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args){
        String text = args[0];
        System.out.println(Pattern.matches("[A-Z][a-z ',]+.",text));
    }
}
