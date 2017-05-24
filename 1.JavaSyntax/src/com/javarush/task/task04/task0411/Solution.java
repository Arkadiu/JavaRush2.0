package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //::CODE:
        String res = month < 3 ? "зима" :
                month < 6 ? "весна" :
                        month < 9 ? "лето" :
                                month < 12 ? "осень" : "зима";
        System.out.println(res);
    }

}