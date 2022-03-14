package com.homework.lesson17;

public class ReverseString {
    public static StringBuilder reverseStr(StringBuilder word) {
        StringBuilder str = new StringBuilder();
        str.append(word);
        str = str.reverse();

        return str;
    }
}
