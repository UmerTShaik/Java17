package com.java17features;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println(fromatterPatterStich("hello"));
    }

    static String fromatterPatterStich(Object o){
        return switch(o){
            case Integer i -> String.format("int %s", i);
            case Long l -> String.format("long %l", l);
            case Double d -> String.format("double %d", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();

        };
    }
}
