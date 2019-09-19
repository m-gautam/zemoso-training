/**
 * Create three interfaces, each with two methods.
 * Inherit a new interface that combines the three, adding a new method.
 * Create a class by implementing the new interface and also inheriting from a concrete class.
 * Now write four methods, each of which takes one of the four interfaces as an argument.
 * In main( ), create an object of your class and pass it to each of the methods.
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 */

package com.java.assignment;

interface if1{
    void foo1();
    void bar1();
}

interface if2{
    void foo2();
    void bar2();
}

interface if3{
    void foo3();
    void bar3();
}

interface baseIf extends if1, if2, if3 {
    void basefoo();
}




class concrete implements baseIf{
    @Override
    public void basefoo(){
        System.out.println("Interface1 function-1");
    }

    @Override
    public void foo1() {
        System.out.println("Interface1 function-1");
    }

    @Override
    public void bar1() {
        System.out.println("Interface1 function-2");
    }

    @Override
    public void foo2() {
        System.out.println("Interface2 function-1");
    }

    @Override
    public void bar2() {
        System.out.println("Interface1 function-2");
    }

    @Override
    public void foo3() {
        System.out.println("Interface3 function-1");
    }

    @Override
    public void bar3() {
        System.out.println("Interface3 function-2");
    }
}



public class InterfaceInheritance extends concrete{

    private void method1(if1 temp){

    }

    private void method2(if2 temp){

    }

    private void method3(if3 temp){

    }

    private void method4(baseIf temp){

    }


    public static void main(String[] args){

        InterfaceInheritance obj = new InterfaceInheritance();

        concrete t = new concrete();
        obj.method1(t);
        obj.method2(t);
        obj.method3(t);
        obj.method4(t);

    }

}


