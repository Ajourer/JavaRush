package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int max = 0;
        int min = strings.get(0).length();
        for (String currentString : strings) {
            if (currentString.length() > max)
                max = currentString.length();
            if (currentString.length() < min)
                min = currentString.length();
        }
        for (String currentString : strings) {
            if (currentString.length() == min || currentString.length() == max) {
                System.out.println(currentString);
                break;
            }
        }
    }
}
