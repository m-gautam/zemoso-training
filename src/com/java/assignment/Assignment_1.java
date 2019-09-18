package com.java.assignment;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment_1 {

    public static void main(String[] args){

        File folder = new File("/home/zadmin/");
        File[] files = folder.listFiles();

        Scanner inp = new Scanner(System.in);
        String reg = inp.nextLine();

        while(reg != null) {

            for (File file : files) {
                String name = file.getName();
                if (name.endsWith(reg)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            reg =inp.nextLine();

        }
    }

}
