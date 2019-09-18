/**
 * Using TextFile and a Map<Character,Integer>.
 * Create a program that takes the file name as a command line argument
 * and counts the occurrence of all the different characters. Save the results in a text file.
 *
 *  Author : Gautam Meena
 *  Date : 19 September 2019
 */

package com.java.assignment;

import java.io.*;
import java.util.HashMap;

public class HashMapChar {

    private HashMap<Character, Integer> occurence = new HashMap<Character, Integer>();
    private PrintWriter out;

    // this methods write occurence of each character to file
    private void writeInFile(HashMap<Character, Integer> occurence, PrintWriter out){
        for(char ch : occurence.keySet()){
            if (ch == ' '){
                out.println("space : " + occurence.get(ch));
            }
            else if(ch == '\n'){
                out.println("newline : " + occurence.get(ch));
            }
            else {
                out.println(ch + " : " + occurence.get(ch));
            }
        }


    }


    // this methods find the occurence of each character

    private void readFile(FileReader file) throws IOException {
        int i;
        while((i = file.read()) != -1){
            char ch = (char) i;

            int v;
            if(occurence.containsKey(ch)){
                v = occurence.get(ch);
                occurence.put(ch, v+1);
            }
            else{
                occurence.put(ch, 1);
            }
        }
    }


    public static void main(String[] args) throws Exception{

        FileReader file = new   FileReader(args[0]);

        HashMapChar obj = new HashMapChar();

        obj.out = new PrintWriter(new FileWriter("Output.txt"));


        obj.readFile(file);
        obj.writeInFile(obj.occurence, obj.out);


        obj.out.close();
    }
}
