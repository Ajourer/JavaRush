package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int points = 0;
         points += score(this.age, anotherCat.age);
         points += score(this.weight, anotherCat.weight);
         points += score(this.strength, anotherCat.strength);
         return points >= 4;
    }
    public int score (int thisIndicator, int anotherIndicator) {
        if (thisIndicator > anotherIndicator)
            return 2;
        else if (thisIndicator == anotherIndicator)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

    }
}
