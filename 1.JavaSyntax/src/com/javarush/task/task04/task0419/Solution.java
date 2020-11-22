package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        System.out.println(max(max(x, y), max(m, n)));
    }
}
