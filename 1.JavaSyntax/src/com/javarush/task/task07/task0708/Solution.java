package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        for (String currentString : strings) {
            if (currentString.length() > max)
                max = currentString.length();
        }
        for (String currentString : strings) {
            if (currentString.length() == max)
                System.out.println(currentString);
        }
    }
}
