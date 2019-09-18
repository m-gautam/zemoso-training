package com.java.assignment;

import java.lang.IndexOutOfBoundsException;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment_8 {
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
        catch (IOException e){
            System.err.println("Caught IO Exception " + e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Error : IndexOutOfBoundsException " + e);
        }
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
        Assignment_8 obj = new Assignment_8();
        obj.writeInFile();
    }
}
