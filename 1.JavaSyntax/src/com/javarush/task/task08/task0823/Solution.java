package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String[] words = text.split(" +");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.equals(""))
                sb.append(firstCharToUpperCase(word)).append(" ");
        }
        System.out.println(sb);
    }

    public static String firstCharToUpperCase(String word) {
            return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
