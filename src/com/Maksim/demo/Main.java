package com.Maksim.demo;
// Static
// Garbage collection

public class Main {
    public static void main(String[] args) {

        //Counter counterA= new Counter();
        //Counter counterB= new Counter();
        Test.test();



        //counter.count();
        //counter.count();

        for (int i = 0; i < 5; i++) {
            System.out.println("--Counter A--");
            Counter.count();
            //counterA.count();

            System.out.println("--Counter B--");
            Counter.count();
            //counterB.count();

        }

    }



}