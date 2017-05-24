package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String res = "такого дня недели не существует";
        switch (day) {
            case 1:
                res = "понедельник";
                break;
            case 2:
                res = "вторник";
                break;
            case 3:
                res = "среда";
                break;
            case 4:
                res = "четверг";
                break;
            case 5:
                res = "пятница";
                break;
            case 6:
                res = "суббота";
                break;
            case 7:
                res = "воскресенье";
                break;
        }
        System.out.println(res);
    }
}