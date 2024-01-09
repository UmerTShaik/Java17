package com.java17features.SwitchCasePart3;

public class Main {

    public static void main(String[] args) {
        typeTester(new Point(2,7));
    }

    static void typeTester(Object o){
        switch (o){
            case null -> System.out.println("null");
            case String s -> System.out.println("String");
            case Color c -> System.out.println("Color with " + c.values().length + " values");
            case Point p -> System.out.println("Record class " +p.toString());
            case int[] ai -> System.out.println("Array of int with length" + ai.length);
            default -> System.out.println("none of them");
        }
    }
}
