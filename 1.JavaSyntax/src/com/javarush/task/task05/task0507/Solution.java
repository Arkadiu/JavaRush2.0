package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int a;
        while ((a = scanner.nextInt()) != -1){
            sum += a;
            count++;
        }
        double average = (double) sum / count;
        System.out.println(average);
    }
}

