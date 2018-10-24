package com.javatpoint;

public class A {
    private B b;

    public A() {
        System.out.println("a is created");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public void print() {
        System.out.println("Hello a");
    }

    public void display() {
        print();
        b.print();
    }
}
