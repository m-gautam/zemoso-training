package com.java.assignment;

interface if1{
    public void foo1();
    public void bar1();
}

interface if2{
    public void foo2();
    public void bar2();
}

interface if3{
    public void foo3();
    public void bar3();
}

interface baseIf extends if1, if2, if3 {
    public void basefoo();
}

public class Assignment_7 {

}
