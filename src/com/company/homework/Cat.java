package com.company.homework;

public class Cat extends Animals {
    public Cat(int run, int swim) {
        super(run, swim);
    }

    public void run(int a) {
        if (a <= 200) {
            System.out.println("кошка пробежала " + a + " м");
        } else {
            System.out.println("столько не бежит");
        }
    }

    public void swim(int b) {
        System.out.println("кошка не умеет плавать");


    }
}
