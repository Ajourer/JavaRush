package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = scanner.nextInt();
        int years = scanner.nextInt();

        System.out.println(name + " получает " + number + " через " + years + " лет.");
    }
}
