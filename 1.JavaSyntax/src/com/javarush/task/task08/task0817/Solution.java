package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Zhuravlev", "Alexander");
        map.put("Petrov", "Nik");
        map.put("Kovalev", "Alexander");
        map.put("Nikolaenko", "Nik");
        map.put("Durov", "Alexander");
        map.put("Pugachev", "Nik");
        map.put("Kolov", "Nik");
        map.put("Zubarev", "Nik");
        map.put("Savenko", "Kostya");
        map.put("Saenko", "Alexander");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        Map<String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            if (set.contains(name)) {
                removeItemFromMapByValue(map, name);
            }
            set.add(name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map1 = createMap();
        removeTheFirstNameDuplicates(map1);
        System.out.println(map1);
    }
}
