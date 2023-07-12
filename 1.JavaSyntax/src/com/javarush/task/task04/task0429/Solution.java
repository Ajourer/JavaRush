package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number > 0)
                positiveNumbers++;
            else if (number < 0)
                negativeNumbers++;
        }
        System.out.println("количество отрицательных чисел: " + negativeNumbers);
        System.out.println("количество положительных чисел: " + positiveNumbers);
    }
}
