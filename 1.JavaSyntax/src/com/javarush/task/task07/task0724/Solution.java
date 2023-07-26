package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Misha", true, 72);
        Human grandpa2 = new Human("Valera", true, 85);
        Human grandma1 = new Human("Ludmila", false, 67);
        Human grandma2 = new Human("Svetlana", false, 82);
        Human dad = new Human("Konstantin", true, 49, grandpa1, grandma1);
        Human mom = new Human("Natalya", false, 47, grandpa2, grandma2);
        Human olderSon = new Human("Alexander", true, 25, dad, mom);
        Human youngerSon = new Human("Kostya", true, 15, dad, mom);
        Human daughter = new Human("Masha", false, 23, dad, mom);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(toString());
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            System.out.println(toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

    }
}