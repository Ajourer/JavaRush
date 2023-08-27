package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty())
                break;
            String family = reader.readLine();
            if (family.isEmpty())
                break;
            map.put(family, city);
        }
        // Read the city
        String cityCheck = reader.readLine();

        if (map.containsValue(cityCheck)) {
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (cityCheck.equals(pair.getValue()))
                    System.out.println(pair.getKey());
            }
        }
    }
}
