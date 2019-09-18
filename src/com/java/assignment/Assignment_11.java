package com.java.assignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Assignment_11 {

    public static void main(String[] args) throws Exception{

        FileReader file = new   FileReader(args[0]);
        HashMap<Character, Integer> occurence = new HashMap<Character, Integer>();

        PrintWriter out = null;
        out = new PrintWriter(new FileWriter("Output.txt"));

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

        out.close();
    }
}
