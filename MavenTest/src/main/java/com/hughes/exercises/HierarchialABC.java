package com.hughes.exercises;

class A {
	private int a = 10; 
    public void displayA() {
        System.out.println("A");
    }
}

class B extends A {
    public void displayB() {
        System.out.println("B");
    }
}

class C extends A {
    public void displayC() {
        System.out.println("C");
    }
}

public class HierarchialABC {
    public static void main(String[] args) {
        C objC = new C();
        B objB = new B();

        objC.displayA(); // Output: Inside class A
        objB.displayB(); 
        objC.displayC(); 
        
    }
}
