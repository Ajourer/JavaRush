package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.EOFException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends IllegalAccessException {
    }

    static class MyException2 extends EOFException {
    }

    static class MyException3 extends IllegalArgumentException {
    }

    static class MyException4 extends ClassCastException {
    }
}

