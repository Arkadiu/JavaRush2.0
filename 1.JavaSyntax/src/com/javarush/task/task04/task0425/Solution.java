package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/
/*
        для первой четверти a>0 и b>0;
        для второй четверти a<0 и b>0;
        для третьей четверти a<0 и b<0;
        для четвертой четверти a>0 и b<0.
        */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = 0;
        if (a > 0 && b > 0)
            res = 1;
        if (a < 0 && b > 0)
            res = 2;
        if (a < 0 && b < 0)
            res = 3;
        if (a > 0 && b < 0)
            res = 4;
        System.out.println(res);
    }
}
