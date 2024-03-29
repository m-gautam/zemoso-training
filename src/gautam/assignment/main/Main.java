/**
 * Create a class in a package yourname.assignment.data containing an int and a char member variables
 * that are not initialized,add a method to print these variables.
 * Add another method in the same class with two local variables and print their values without initializing them.
 *
 * Create another class in package yourname.assignment.singleton containing a non static String member variable.
 * Add a static method that takes String as parameter and initialize the member variable
 * and then return object of that class. Add a non static method to print the String.
 *
 * Create main class in package yourname.assignment.main, create object of first class
 * and call both the methods to print the values. Create object of second class using static
 * method and then call the other method to print the String.
 *
 * One or more tasks mentioned above are not possible in JAVA,
 * comment that part of the code with block comments and add the explanation for the same.
 *
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
