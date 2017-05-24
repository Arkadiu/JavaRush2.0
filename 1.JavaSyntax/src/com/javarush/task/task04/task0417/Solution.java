package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String res = "";
        if (a == b || a == c) {
            res += a + " ";
        }
        if (b == a || b == c)
            res += b + " ";
        if (c == a || c == b)
            res += c + " ";
        if (!res.equals(""))
            System.out.println(res);
    }
}