package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(bf.readLine());
        }
        int tempLength = list.get(0).length();
        for (int i= 1; i < 10; i++) {
            if (tempLength > list.get(i).length()){
                System.out.println(i);
                break;
            }else
                tempLength = list.get(i).length();
        }
    }
}

