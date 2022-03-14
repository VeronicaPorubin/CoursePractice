package com.homework.lesson17;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

import static com.homework.lesson17.Abbreviations.printInitials;
import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int k;
            System.out.println();
            System.out.println("1. First exercise.");
            System.out.println("2. Second exercise.");
            System.out.println("3. Third exercise.");
            System.out.println("4. Fourth exercise.");
            System.out.println("5. Exit!");
            k = scanner.nextInt();

            switch (k) {
                case 1:
                    CompareProgram compare = new CompareProgram();
                    boolean equals1, equals2 = compare.compareString();
                    break;
                case 2:
                    Abbreviations printName = new Abbreviations();
                    System.out.println("Enter the name:");
                    String fullName = scanner.nextLine();
                    printInitials(fullName);
                    break;

                case 3:
                    ReverseString reverse = new ReverseString();
                    System.out.println("Input the worlds");
                    String str = scanner.nextLine();
                    reverse(str);
                    break;
                case 4:
                    CountWords countWords = new CountWords();
                    int count = CountWords.countNumberOfWords();
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("You used the wrong option!");
            }
        }
    }

}

