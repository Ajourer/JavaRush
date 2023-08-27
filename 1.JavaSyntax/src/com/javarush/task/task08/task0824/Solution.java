package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        List<Human> people = new ArrayList<>();

        ArrayList<Human> children = new ArrayList<>();
        Human child1 = new Human("Alex", true, 25, new ArrayList<>());
        Human child2 = new Human("Maria", false, 22, new ArrayList<>());
        Human child3 = new Human("Anna", false, 20, new ArrayList<>());
        Collections.addAll(children, child1, child2, child3);

        ArrayList<Human> dadAsSon = new ArrayList<>();
        ArrayList<Human> momAsDaughter = new ArrayList<>();
        Human father = new Human("Kostya", true, 49, children);
        Human mother = new Human("Natalya", false, 47, children);
        dadAsSon.add(father);
        momAsDaughter.add(mother);

        Human grandpa1 = new Human("Misha", true, 76, dadAsSon);
        Human grandma1 = new Human("Ludmila", false, 73, dadAsSon);
        Human grandpa2 = new Human("Valera", true, 80, momAsDaughter);
        Human grandma2 = new Human("Sveta", false, 77, momAsDaughter);

        Collections.addAll(people, grandpa1, grandma1, grandpa2, grandma2,
                father, mother, child1, child2, child3);

        for (Human person : people) {
            System.out.println(person.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
