package com.homework.lesson19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PrintDataTime {
    public static void printDate () {
        String time;

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatterLocalDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        time = formatterLocalDate.format(localDate);
        System.out.println("Local Date Now: " + time);
    }
    public static void printTime (){
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatterLocalTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        formatterLocalTime.format(localTime);
        System.out.println("Local Time Now: " + LocalTime.now().format(formatterLocalTime));
    }
    public static  void printDateTime (String resultData){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatterLocalDateTime =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        resultData = formatterLocalDateTime.format(localDateTime);
        System.out.println("Local Date Time Now: " + resultData);
    }
}
