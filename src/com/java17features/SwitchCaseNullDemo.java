package com.java17features;

public class SwitchCaseNullDemo {
    public static void main(String[] args) {
        testFooBar(null);
    }

    static void testFooBar(String s){
        switch (s){
            case null -> System.out.println("null");
            case "Foo", "Bar" -> System.out.println("Correct!");
            default -> System.out.println("Ok!");
        }
    }
}
