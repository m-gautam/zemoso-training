/**
 * Checks given string contains all alphabets.
 * Author : Gautam Meena
 * Date : 19 September 2019
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 **/


package com.java.assignment;

import java.util.Scanner;

public class ContainAllAlphabets {
    /**
     * counts the occurence of character in string
     * updates the variable to 1 for each character
     */
    private boolean checkAllCharacters(String str){
        // Contains all the alphabets
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] count = new int[26];
        int ct = 0;

        // Travesing over input string
        for(char c : str.toCharArray()){
            int index = characters.indexOf(Character.toUpperCase(c));
            if(index != -1 && count[index] == 0){
                count[index] = 1;
                ct += 1;
            }
        }

        return ct == 26;

    }

    public static void main(String[] args){
        // taking input
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(args[0]);
        // String str="The quick brown fox jumps over the lazy dog";
        ContainAllAlphabets obj = new ContainAllAlphabets();
        System.out.println(obj.checkAllCharacters(str));

    }
}
