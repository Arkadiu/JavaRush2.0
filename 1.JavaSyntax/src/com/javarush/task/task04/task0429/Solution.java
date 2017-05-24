package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int countNeg = 0;
        int countPos = 0;
        for (int i = 0; i < 3; i++){
            int a = scanner.nextInt();
            if (a > 0)
                countPos++;
            if (a < 0)
                countNeg++;
        }
        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);
    }
}
