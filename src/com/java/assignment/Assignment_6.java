package com.java.assignment;

public class Assignment_6 {

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
