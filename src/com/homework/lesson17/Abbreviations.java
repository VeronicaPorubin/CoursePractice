package com.homework.lesson17;

public class Abbreviations {

    public static void printInitials(String fullName) {
        fullName = fullName.trim();
        int len = fullName.length();
        String str = "";
        for (int i = 0; i < len; i++) {
            char ch = fullName.charAt(i);
            if (ch != ' ') {
                str = str + ch;
            }
            else {

                System.out.print(Character.toUpperCase(str.charAt(0)) + ". ");
                str = "";
            }
        }
        String temp = "";
        for (int j = 0; j < str.length(); j++) {

            if (j == 0)
                temp = temp + Character.toUpperCase(str.charAt(0));
            else
                temp = temp + Character.toLowerCase(str.charAt(j));
        }
        System.out.println(temp);
    }

}
