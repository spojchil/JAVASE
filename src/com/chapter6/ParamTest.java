package com.chapter6;

public class ParamTest {
    public static void main(String[] args) {
        /*
        * Test 1: Methods can't modify numeric parameters
        * */
        System.out.println("")
    }

    public static void tripleValue(double x){
        x = 3 * x;
        System.out.println("tripleValue of x is " + x);
    }
}
