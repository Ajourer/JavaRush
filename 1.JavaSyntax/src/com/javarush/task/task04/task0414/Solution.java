package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        int remainder = year % 400;
        int remainder2 = year % 100;
        int remainder3 = year % 4;
        if (remainder == 0) {
            System.out.println("количество дней в году: 366");
        } else if (remainder2 == 0) {
            System.out.println("количество дней в году: 365");
        } else if (remainder3 == 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}