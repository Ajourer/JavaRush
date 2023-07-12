package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = 0;
        double sum = 0;

        while (true) {
            double number = Double.parseDouble(reader.readLine());
            if (number == -1)
                break;
            sum += number;
            quantity++;
        }
        System.out.println(sum / quantity);
    }
}

