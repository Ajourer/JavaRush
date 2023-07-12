package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        int[] firstHalf = new int[10];
        int[] secondHalf = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            firstHalf[i] = numbers[i];
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            secondHalf[i] = numbers[numbers.length / 2 + i];
        }
        for (int currentValue : secondHalf) {
            System.out.println(currentValue);
        }
    }
}
