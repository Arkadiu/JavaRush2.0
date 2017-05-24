package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String res = "";

        boolean negPos = num > 0;
        boolean evenOdd = num % 2 == 0;

        if (negPos){
            res += "положительное ";
        }else
            res += "отрицательное ";
        if (evenOdd){
            res += "четное ";
        }else
            res += "нечетное ";
        if (num == 0){
            res = "ноль";
        }else
            res += "число";
        System.out.println(res);
    }
}
