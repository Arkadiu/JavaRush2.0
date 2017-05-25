package com.javarush.task.task07.task0712;

import java.util.ArrayList;/*
Самые-самые
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(scanner.next());
        }
        String maxLength = list.get(0);
        String minLength = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxLength.length()) {
                maxLength = list.get(i);
            }
            if (list.get(i).length() < minLength.length()) {
                minLength = list.get(i);
            }
        }
        if (list.indexOf(maxLength) < list.indexOf(minLength))
            System.out.println(maxLength);
        else
            System.out.println(minLength);
    }
}
