/**
 * Author : Gautam Meena
 * Date : 19 September 2019
 **/
package gautam.assignment.main;

import gautam.assignment.data.Assignment_5;
import gautam.assignment.singleton.Assignment_5b;

import static gautam.assignment.singleton.Assignment_5b.print;

public class Main {

    public static void main(String[] args){

        // Creating instance of Assignment_5 class
        Assignment_5 obj = new Assignment_5();
        obj.printFields();
        obj.printLocal();

        // Creating instance of Assignment_5b class
        Assignment_5b newObj = print("abc");
        newObj.printField();

    }
}
