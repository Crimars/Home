package com.company.homework;

public class Lesson_1 {

    public static void main(String[] args) {

        byte b = 12;
        short s = 14;
        int i = 32;
        long l = 11L;
        float f = 3f;
        double d = 121.2;
        char c = 'g';
        boolean bo = true;
    }

    public static float formula(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean summa(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void positiveNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean negatOrPositive(int a){
          return a < 0;}
    public static void name(String name){
        System.out.println("Привет, "+name+"!");
    }


    }





