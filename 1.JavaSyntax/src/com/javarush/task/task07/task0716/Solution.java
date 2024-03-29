package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("лр");
        strings.add("л");
        strings.add("л");
        strings.add("р");
        strings.add("р");
        strings.add("л");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {
                strings.add(i + 1, strings.get(i++));
            }
            if (strings.get(i).contains("р") && !strings.get(i).contains("л"))
                strings.remove(i--);
        }
        return strings;
    }
}

//лр л л р