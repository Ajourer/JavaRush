package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Murzik", new Cat("Murzik"));
        map.put("Puh", new Cat("Puh"));
        map.put("Shushu", new Cat("Shushu"));
        map.put("Simba", new Cat("Simba"));
        map.put("Mosya", new Cat("Mosya"));
        map.put("Klopa", new Cat("Klopa"));
        map.put("Barsik", new Cat("Barsik"));
        map.put("Marta", new Cat("Marta"));
        map.put("Sahar", new Cat("Sahar"));
        map.put("Shugar", new Cat("Shugar"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
