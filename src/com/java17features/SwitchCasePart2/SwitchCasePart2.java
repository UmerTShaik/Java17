package com.java17features.SwitchCasePart2;

public class SwitchCasePart2 {
    public static void main(String[] args) {
        Shape shape = new Triangle(10,20);
        testTriangle(shape);
    }

    //use case :before java 17 below
    static void testTriangle(Shape s){
//        switch (s){
//            case null:
//                break;
//            case Triangle t:
//                if(t.calculateAre() > 100){
//                    System.out.println("Large Triangle");
//                    break;
//                }
//            default:
//            System.out.println("A shape : possibly a small triangle");
//        }

        //The above can be written as below in jva 17
        switch(s){

            //case Triangle t && (t.calculateAre() >100 )-> System.out.println("Larger Triangle");
            default: System.out.println("A shape : possibly a small triangle");


        }

    }
}

