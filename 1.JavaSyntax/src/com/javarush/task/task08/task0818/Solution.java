package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Zhuravlev", 150000);
            map.put("Ozonov", 400);
            map.put("Osipov", 500);
            map.put("Polov", 1345);
            map.put("Coy", 444);
            map.put("Zhuravleva", 0);
            map.put("Rylov", 200000);
            map.put("Oganysyan", 2500);
            map.put("Morozov", 1);
            map.put("Zubarev", 499);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}