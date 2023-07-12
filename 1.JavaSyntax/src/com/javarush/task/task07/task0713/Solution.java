package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> multipleOfThree = new ArrayList<>();
        ArrayList<Integer> multipleOfTwo = new ArrayList<>();
        ArrayList<Integer> anotherList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer currentNumber : mainList) {
            if (currentNumber % 3 == 0)
                multipleOfThree.add(currentNumber);
            if (currentNumber % 2 == 0)
                multipleOfTwo.add(currentNumber);
            if (currentNumber % 3 != 0 && currentNumber % 2 != 0)
                anotherList.add(currentNumber);
        }

        printList(multipleOfThree);
        printList(multipleOfTwo);
        printList(anotherList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer currentNumber : list) {
            System.out.println(currentNumber);
        }
    }
}
