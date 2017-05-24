package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String res = "";
        boolean evenOdd = a % 2 == 0;
        boolean singleValued = String.valueOf(a).length() == 1;
        boolean twoValued = String.valueOf(a).length() == 2;
        boolean threeValued = String.valueOf(a).length() == 3;
        boolean includedRange = a >= 1 && a <= 999;

        if (evenOdd) {
            res += "четное ";
        } else
            res += "нечетное ";
        if (singleValued)
            res += "однозначное ";
        if (twoValued)
            res += "двузначное ";
        if (threeValued)
            res += "трехзначное ";
        if (includedRange) {
            res += "число";
            System.out.println(res);
        }
    }
}
