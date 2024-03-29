/**
 * A vampire number v is a number with an even number of digits n,
 * that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
 * where v contains precisely all the digits from x and from y, in any order.
 * Write a java program to print first 100 vampire numbers.
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 **/
package com.java.assignment;

public class VampireNo {

    public static void main(String[] args){
        int n = 1;
        int count = 0;
        while(count<=100) {
            String num = Integer.toString(n);
            if (num.length() % 2 == 0) {
                if (!num.contains("0")) {
                    System.out.println(n);
                    count++;
                }
            }
            n++;
        }

    }

}
