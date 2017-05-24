package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        double res = time % 5;
        String result = "красный";
        if (res < 3){
            result = "зелёный";
        }else if (res < 4){
             result = "желтый";
        }
        System.out.println(result);
    }
}