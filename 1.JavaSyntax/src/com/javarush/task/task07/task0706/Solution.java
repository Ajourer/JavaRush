package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sumLeft = 0;
        int sumRight = 0;
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0)
                sumRight += numbers[i];
            else if (i % 2 != 0)
                sumLeft += numbers[i];
        }
        if (sumRight > sumLeft)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (sumRight < sumLeft)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
