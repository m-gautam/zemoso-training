/**
 * Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
 * Create factories for each type of Cycle, and code that uses these factories.
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 */

package com.java.assignment.inheritance;


interface cycle {
    void balance();
    void wheels();
    void build();
}

class UniCycle implements cycle{

    @Override
    public void balance(){
        System.out.println("It has least balance");
    }
    @Override
    public void wheels(){
        System.out.println("It has one wheel");
    }
    @Override
    public void build() {
        System.out.println("Unicycle structure");
    }
}

class BiCycle implements cycle{

    @Override
    public void balance(){
        System.out.println("It has moderate balance");
    }

    @Override
    public void wheels(){
        System.out.println("It has two wheels");
    }

    @Override
    public void build() {
        System.out.println("BiCycle structure");
    }
}

class TriCycle implements cycle{

    @Override
    public void balance(){
        System.out.println("It is safe to ride!!");
    }

    @Override
    public void wheels(){
        System.out.println("It has three wheels");
    }

    @Override
    public void build() {
        System.out.println("Tricycle Structure");
    }
}

class CycleFactory{

    cycle buildCycle(String type){

        if(type == null){
            return null;
        }
        else if( type.equalsIgnoreCase("unicycle")){
            return new UniCycle();
        }
        else if( type.equalsIgnoreCase("bicycle")){
            return new BiCycle();
        }
        else {
            return new TriCycle();
        }
    }

}

public class CycleInterface {

    public static void main(String[] args) {

        CycleFactory cf = new CycleFactory();

        cycle newCycle = cf.buildCycle("tricycle");
        newCycle.build();

        cycle newCycle2 = cf.buildCycle("bicycle");
        newCycle2.build();

    }
}
