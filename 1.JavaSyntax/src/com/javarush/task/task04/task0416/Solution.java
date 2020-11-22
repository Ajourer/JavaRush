package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minutes = Double.parseDouble(reader.readLine());

        if (minutes > 0) {
            if (minutes % 5 >= 0 && minutes % 5 < 3)
                System.out.println("зелёный");
            if (minutes % 5 >= 3 && minutes % 5 < 4)
                System.out.println("желтый");
            if (minutes % 5 >= 4 && minutes % 5 < 5)
                System.out.println("красный");
        }
    }
}