package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String res = a + b <= c ? "не " :
                a + c <= b ? "не " :
                        b + c <= a ? "не " : "";
        System.out.println(String.format("Треугольник %sсуществует.", res));
    }
}