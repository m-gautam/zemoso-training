package com.java.assignment;

import java.util.regex.Pattern;

public class Assignment_9 {

    public static void main(String[] args){
        String text = args[0];
        System.out.println(Pattern.matches("[A-Z][a-z ',]+.",text));
    }
}
