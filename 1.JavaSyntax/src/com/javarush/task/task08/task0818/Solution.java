package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Семенов", 610);
        map.put("Петров", 120);
        map.put("Сидоров", 230);
        map.put("Николаев", 340);
        map.put("Соловьев", 450);
        map.put("Себякин", 660);
        map.put("Собакин", 770);
        map.put("Синицын", 980);
        map.put("Семечкин", 490);
        map.put("Степанов", 500);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 500){
               iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}