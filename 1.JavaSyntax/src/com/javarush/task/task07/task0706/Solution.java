package com.javarush.task.task07.task0706;

import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        String res = "";

        int[] numHome = new int[15];
        for (int i= 0; i < numHome.length; i++) {
            numHome[i] = scanner.nextInt();
            if (i % 2 == 0)
                evenCount += numHome[i];
            else
                oddCount += numHome[i];
        }
        if (oddCount > evenCount)
            res = "не";
        System.out.println(String.format("В домах с %sчетными номерами проживает больше жителей.", res));
    }
}
