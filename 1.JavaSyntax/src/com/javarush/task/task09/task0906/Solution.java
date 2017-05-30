package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        int index = 0;
        for (int i = 0; i < stack.length; i++){
            if ("main".equals(stack[i].getMethodName())) {
                index = i;
                break;
            }
        }

        System.out.println(String.format("%s: %s: %s",
                stack[index].getClassName(),
                stack[index].getMethodName(),
                s
        ));
    }
}
