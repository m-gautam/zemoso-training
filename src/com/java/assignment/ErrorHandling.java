/**
 * Create three new types of exceptions. Write a class with a method that throws all three.
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 * Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 **/

package com.java.assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorHandling {
    private static final int SIZE = 10;
    private PrintWriter out = null;
    private int[] arr = new int[SIZE];

    private void writeInFile(){
        try{
            System.out.println("Entering try Statement");
            out = new PrintWriter(new FileWriter("Outfile.txt"));
            for(int i = 0; i <= 11; i++){
                out.println(866164);
                arr[i] = 1;
            }
        }
        // checked exception
        catch (IOException e){
            System.err.println("Caught IO Exception " + e);
        }

        // Runtime Exception : if access index of array which does not exist
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Error : IndexOutOfBoundsException " + e);
        }

        // Runtime exception : if variable is null and is used to access it.
        catch (NullPointerException e){
            System.err.println("Error : NUllPointerException " + e);
        }

        finally{
            if(out != null){
                System.out.println("Closing PrintWriter");
                out.close();
            }
            else{
                System.out.println("PrintWriter not open");
            }
        }
    }


    public static void main(String[] args){
        ErrorHandling obj = new ErrorHandling();
        obj.writeInFile();
    }
}
