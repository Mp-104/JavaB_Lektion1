package com.Maksim.demo;

public class Counter {

    //int value = 0;   // for comparison with and without static
     static int value = 0;

     static public void count () {

        System.out.println("before " + value);
        value ++;
        System.out.println("after " + value);


    }

    // Todo about static
    // Static methods, MUST have static variables
    // regular methods, CAN have static variables
    //
    // What does static method do?
    // - Added new feature
    //      - No necessary instantiation for method calling, direct access method through class
    // - DO NOT use for unique objects
    // -
    // What does static variable do?
    // - Unchanged memory position,
    // - only ONE memory position is allocated,
    // - ONE reference only, will change others



}
