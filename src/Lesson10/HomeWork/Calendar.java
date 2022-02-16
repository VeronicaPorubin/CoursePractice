package Lesson10.HomeWork;

public class Calendar {
    public static void main(String[] args) {
        CalendarEnum.MonthOfTheYear[] month = CalendarEnum.MonthOfTheYear.values();
        for (int j=0; j< month.length; j++){
            System.out.print( month [j] + ", ");
        }

    }

}
