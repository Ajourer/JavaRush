package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Журавлев", dateFormat.parse("JUNE 22 1976"));
        map.put("Большаков", dateFormat.parse("APRIL 1 2012"));
        map.put("Сычев", dateFormat.parse("JULY 1 2012"));
        map.put("Сидоров", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Петров", dateFormat.parse("MARCH 1 2012"));
        map.put("Титов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Тихомирова", dateFormat.parse("MAY 1 2012"));
        map.put("Колпакова", dateFormat.parse("JUNE 1 2012"));
        map.put("Ягодин", dateFormat.parse("OCTOBER 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if (month >= 5 && month <= 7) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}