package com.java17features.record;

public record Employee(String naem , int id) {

    //way 1: writing expliclty anonocal contructor
//    public Employee(String naem , int id){
//        this.naem = naem;
//        this.id = 1000 +id;
//
//    }

    //way 2:Compact contructor
    public Employee{
        //you can alter one or movre values assigend
        naem = naem.toLowerCase();
    }
}
