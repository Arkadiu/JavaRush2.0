package com.javarush.task.task04.task0408;

/* 
Хорошо или плохо?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //напишите тут ваш код
        String result = "равно";
        if (a > 5)
            result = "больше";
        if (a < 5)
            result = "меньше";
        System.out.println(String.format("Число %s 5", result));

    }
}