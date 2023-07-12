package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number > 0 && number < 1000) {
            int digits = 0;
            String evenOdd = (number % 2 == 0) ? "четное" : "нечетное";
            while (number > 0) {
                digits++;
                number /= 10;
            }
            String digitsNumber = (digits == 1) ? "однозначное" : (digits == 2) ? "двузначное" : "трехзначное";
            System.out.println(evenOdd + " " + digitsNumber + " число");
        }
    }
}
