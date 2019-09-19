 /**
  * Search through the home directory and look for files that match a regular expression.
  *
  * Author : Gautam Meena
  * Date : 19 September 2019
 **/
package com.java.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileSearch {

    private void searchFile(File file, String reg){

        // endsWith method is used for implementing regular expression which is file method
        String name = file.getName();

        if (name.endsWith(reg)) {
            System.out.println(file.getAbsolutePath());
        }

    }

    public static void main(String[] args) throws IOException {

        FileSearch obj = new FileSearch();
        // creates a directory variable
        File folder = new File("/home/zadmin/Downloads/");
        File[] files = folder.listFiles();


        // Taking input for regular expression
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String reg = br.readLine();

        while(reg != null) {
            try {
                for (File file : files) {
                    //System.out.println(file.getName());
                    if (file.isDirectory()) {
                        File[] subFiles = file.listFiles();
                        for (File sfile : subFiles) {
                            obj.searchFile(sfile, reg);
                        }
                    }
                    else {
                        obj.searchFile(file, reg);
                    }
                }
            }
            catch(NullPointerException e){
                System.err.println(e);
            }


                // this method needs specific regex to compare string.
               // if(Pattern.matches(reg, name)){
//                    System.out.println(file.getAbsolutePath());
//                }
            reg = br.readLine();
        }

    }

}


