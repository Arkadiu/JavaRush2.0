package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends NumberFormatException{
    }

    static class MyException2 extends ArrayIndexOutOfBoundsException{
    }

    static class MyException3 extends FileNotFoundException{
    }

    static class MyException4 extends MyException3{
    }
}

