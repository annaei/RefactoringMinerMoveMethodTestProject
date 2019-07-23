package org.main;

public class B {
    private String myVar = "myVar";

    void m(){
        myVar = "B.m";
        System.out.println(myVar);
    }

    void n(){
        myVar = "B.n";
        System.out.println(myVar);
    }

    void foo(B b){
        b.m();
        b.n();
    }
}
