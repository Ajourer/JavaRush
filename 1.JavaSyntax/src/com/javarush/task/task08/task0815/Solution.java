package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Zhuravlev", "Alexander");
        map.put("Pavlov", "Konstantin");
        map.put("Zvereva", "Polina");
        map.put("Petrenko", "Alexander");
        map.put("Nahimova", "Alexandra");
        map.put("Zhurkina", "Ksenia");
        map.put("Nabokova", "Ksenia");
        map.put("Komov", "Alexander");
        map.put("Lisicyn", "Alexander");
        map.put("Portnova", "Ksenia");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int sameNamesNum = 0;
        for (String firstName : map.values()) {
            if (firstName == name)
                sameNamesNum++;
        }
        return sameNamesNum;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        return map.containsKey(lastName) ? 1 : 0;
    }

    public static void main(String[] args) {
    }
}
