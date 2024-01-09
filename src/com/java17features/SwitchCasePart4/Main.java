package com.java17features.SwitchCasePart4;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        test("string");
    }

    //Part 1
//    static void test(Object o){
//        switch(o){
//            case Character c-> {
//                if(c.charValue() == 97){
//                    System.out.println("a: ");
//                }
//                System.out.println("Character");
//            }
//            case Integer i->
//                throw new IllegalStateException("Inavlid Integer arugment of value " + i.intValue());
//            default -> {
//                break;
//            }
//        }
//    }

    //Part 2
    static void test(Object o){
        switch(o){
            case Character c : {
                if(c.charValue() == 97){
                    System.out.println("a: ");
                }
                System.out.println("Character");
            }
           // case Integer i:     //compiler warns its a illegal fall thgourh to a pattern
            //    System.out.println("Inavlid Integer arugment of value " + i.intValue());
            default :
                break;
            }
        }
}
