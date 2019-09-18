/**
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
 * Create instances of all three types and upcast them to an array of Cycle.
 * Try to call balance( ) on each element of the array and observe the results.
 * Downcast and call balance( ) and observe what happens.
 *
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 **/

package com.java.assignment.inheritance;

interface cycle{
    void balance();
    void wheels();

}
class Super implements cycle{

    Super(){
        System.out.println("Super Class");
    }

    @Override
    public void balance() {
        System.out.println("Balance of super class");
    }

    public void wheels(){

    }


}

class Unicycle extends Super{
    Unicycle(){
        System.out.println("Unicycle Class");
    }

    @Override
    public void balance(){
        System.out.println("Balance of Unicycle");
    }
}

class Bicycle extends Super{
    Bicycle(){
        System.out.println("Bicycle Class");
    }

    @Override
    public void balance(){
        System.out.println("Balance of Bicycle");
    }
}

class Tricycle extends Super{
    Tricycle(){
        System.out.println("Tricycle Class");
    }
}

public class Cycle {
    public static void main(String[] args){
        System.out.println("Main class");

        Unicycle uobj = new Unicycle();
        Bicycle bobj = new Bicycle();
        Tricycle tobj = new Tricycle();

        Super[] obj = new Super[3];
        obj[0] = (Super) uobj;
        obj[1] = (Super) bobj;
        obj[2] = (Super) tobj;

        System.out.println("\n----After Upcasting-----");
        obj[0].balance();
        obj[1].balance();
        obj[2].balance();

        System.out.println("\n----After Downcasting-----");
        uobj = (Unicycle) obj[0];
        bobj = (Bicycle) obj[1];
        tobj = (Tricycle) obj[2];

        uobj.balance();
        bobj.balance();
        tobj.balance();

    }
}
