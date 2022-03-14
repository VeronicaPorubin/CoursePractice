package com.homework.lesson17;

public class CountWords {

    public static int countNumberOfWords (){
    String str = "Hello Java World ";
    int count = 1;

        for (int i = 0; i < str.length() - 1; i++)
    {
        if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
        {
            count++;
        }
    }
        System.out.println("Number of words in a string : " + count);
        return count;
    }
}
