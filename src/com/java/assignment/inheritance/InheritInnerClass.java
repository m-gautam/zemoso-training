/**
 *  Create a class with an inner class that has a non-default constructor (one that takes arguments).
 *  Create a second class with an inner class that inherits from the first inner class.
 *
 *  Author : Gautam Meena
 *  Date : 19 September 2019
 */
package com.java.assignment.inheritance;

class A {
    static class innerClassA{
        innerClassA(int a){
            System.out.println("Class A non-default constructor");
        }
    }
}

class B{
    static class innerClassB extends A.innerClassA {

        innerClassB(int a) {
            super(a);
            System.out.println("ClassB");
        }
    }
}