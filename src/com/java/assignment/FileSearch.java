 /**
  * Search through the home directory and look for files that match a regular expression.
  *
  * Author : Gautam Meena
  * Date : 19 September 2019
 **/
package com.java.assignment;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileSearch {

    public static void main(String[] args){

        // creates a directory variable
        File folder = new File("/home/zadmin/");
        File[] files = folder.listFiles();

        // Taking input for regular expression
        Scanner inp = new Scanner(System.in);
        String reg = inp.nextLine();

        while(reg != null) {

            assert files != null;
            for (File file : files) {
                String name = file.getName();

                // endsWith method is used for implementing regular expression
                if (name.endsWith(reg)) {
                    System.out.println(file.getAbsolutePath());
                }

                // this needs specific regex to compare string.
                if(Pattern.matches(reg, name)){
                    System.out.println(file.getAbsolutePath());
                }
            }
            reg =inp.nextLine();

        }
    }

}
