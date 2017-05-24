package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = 0;
        if (a == b && a != c)
            res = 3;
        else if (a == c && b != c)
            res = 2;
        else if (b == c && a != c)
            res = 1;
        if (res != 0)
            System.out.println(res);
    }
}
