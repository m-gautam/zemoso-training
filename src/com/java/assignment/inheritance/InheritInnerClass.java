package com.java.assignment.inheritance;

class A {
    class innerClassA{
        innerClassA(int a){
            System.out.println("Class A non-default constructor");
        }
    }
}

class B{
    class innerClassB extends A.innerClassA {

        innerClassB(int a) {
            super(a);
            System.out.println("ClassB")
        }
    }
}