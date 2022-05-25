package com.company;

import com.company.furniture.Sofa;

public class Main {
    public static void main(String[] args) {
        Sofa divan = new Sofa();
        divan.setName("диванчик");

        Human human = createHuman(90);
        System.out.println("Имя: " + human.name);

        human.moveTo(divan);
    }

    public static Human createHuman(int age) {
        if (age > 50) {
            Ded ded = new Ded();
            ded.name = "Дед";
            ded.age = age;
            return ded;
        } else {
            Human neDed = new Human();
            neDed.name = "Не дед";
            neDed.age = age;
            return neDed;
        }
    }
}
