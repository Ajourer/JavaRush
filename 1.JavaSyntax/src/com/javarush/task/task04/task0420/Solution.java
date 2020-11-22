package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {

    public static int max(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }

    public static int min(int a, int b){
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = max(max(a, b), c);
        int min = min(min(a, b), c);
        int mid = a + b + c - (max + min);

        System.out.println(max + " " + mid + " " + min + " ");
    }
}
