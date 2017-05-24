package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int res = 365;
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            res = 366;
        }
        System.out.println(String.format("количество дней в году: %d", res));
    }
}