package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        //::CODE:
        String res = a < 50 ? "не " : a > 100 ? "не " : "";
        System.out.println(String.format("Число %d %sсодержится в интервале.", a, res));
    }
}