package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle (int left, int top, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle (int left, int top) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle (int left, int top, int width) { //создаем квадрат
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public Rectangle (Rectangle copy) { //создаем копию прямоугольника
        this.top = copy.top;
        this.left = copy.left;
        this.width = copy.width;
        this.height = copy.height;
    }

    public static void main(String[] args) {

    }
}
