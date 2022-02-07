package com.homework.lesson6;

public class Exercise1 {
    public static void main(String[] args) {
        temperature(36);
    }

    public static void temperature(int temperature) {
        if (temperature > 60) {
            System.out.println("Porridge is too hot.");
        } else if (temperature < 35) {
            System.out.println("Porridge is too cold.");
        } else if (temperature >= 36 && temperature <= 59) {
            System.out.println("Porridge is just right.");
        }
    }


}

