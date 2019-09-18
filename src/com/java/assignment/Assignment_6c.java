package com.java.assignment;

public class Assignment_6c {

    public Assignment_6c(String s){
        System.out.println("argument is " + s);
    }

    public static void main(String[] args){
        Assignment_6c[] obj = new Assignment_6c[2];
        obj[0] = new Assignment_6c("hello");
    }
}
