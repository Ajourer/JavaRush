package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        System.out.print(LocalDateTime.now().getDayOfMonth() + " ");
        System.out.print(LocalDateTime.now().getMonthValue() + " ");
        System.out.print(LocalDateTime.now().getYear());
    }
}
