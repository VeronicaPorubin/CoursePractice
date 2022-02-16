package Lesson9.HomeWork;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = 'a';
        String words;
        System.out.println("Enter the words: ");
        words = scanner.nextLine();
        int result = searchCharacter(words, character);
        searchCharacter(words, character);
        System.out.println("The Character '" + character + "' appears " + result + " times.");


    }

    public static int searchCharacter(String words, char character) {
        int count = 0;
        for (int j = 0; j < words.length(); j++) {
            if (words.charAt(j) == character)
                count++;
        }
        return count;
    }
}
