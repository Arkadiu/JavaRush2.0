package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        do {
            int num = a % 10;
            if (num % 2 == 0)
                even++;
            else
                odd++;
            a = a / 10;
        } while (a != 0);
        System.out.println(String.format("Even: %d Odd: %d", even, odd));
    }
}
