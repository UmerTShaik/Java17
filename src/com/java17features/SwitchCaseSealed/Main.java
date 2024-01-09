package com.java17features.SwitchCaseSealed;

public class Main {
    public static void main(String[] args) {
        System.out.println(testSealedConvergae(new C(5)));
    }

    static int testSealedConvergae(S s){
        return switch(s){
            case A a -> 1;
            case B b -> 2;
            case C c -> 3 ;
        };
    }
}
