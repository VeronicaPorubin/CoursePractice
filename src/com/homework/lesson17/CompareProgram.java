package com.homework.lesson17;

public class CompareProgram {
    public static boolean compareString() {
        String A = "Stephen Edwin King";
        String B = "stephen edwin king";
        String C = "Walter Winchell";
        boolean equals1 = A.equalsIgnoreCase(B);
        boolean equals2 = A.equalsIgnoreCase(C);
        System.out.println("\"" + A + "\" equals \"" + B + "\"  ? - " + equals1);
        System.out.println("\"" + A + "\" equals \"" + C + "\"  ? - " + equals2);

        return A.equalsIgnoreCase(B) && A.equalsIgnoreCase(C);

    }




}
