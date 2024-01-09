package com.java17features.SwitchCasePart2;

public class SwitchTypeChecking {

    public static void main(String[] args) {

    }

    static void error(Object o){
        switch(o){
            case CharSequence cs -> System.out.println("A sequence of length " +cs.length());
            //Error pattern is dominated by CharDeqience prvious pattern
            //case String s-> System.out.println("A string" + s);
            default -> {
                break;
            }
        }

    }
}
