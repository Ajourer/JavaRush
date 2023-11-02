package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Collections;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] arr1 = {11, 3, 10, 0, 97};
        int[] arr2 = {1024, 2048};
        int[] arr3 = {-3, -5, -6, -13};
        int[] arr4 = {2, 4, 6, 8, 10, 12, 14};
        int[] arr5 = {};
        Collections.addAll(list, arr1, arr2, arr3, arr4, arr5);
        return list;
     }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
