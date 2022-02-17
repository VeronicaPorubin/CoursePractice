package Lesson10.HomeWork;

public class Main {
    public static void main(String[] args) {
        //Exercise 1.
        System.out.println("---------------------------Exercise 1: ");
        CalendarEnum.MonthOfTheYear[] month = CalendarEnum.MonthOfTheYear.values();
        for (int j=0; j< month.length; j++){
            System.out.print( month [j] + ", ");
        }
        System.out.println("  ");
        //Exercise 2.
        System.out.println("---------------------------Exercise 2: ");
        System.out.println(Week.Weekday.MONDAY.isWeekday());  // true
        System.out.println(Week.Weekday.FRIDAY.isHoliday()); //false
        System.out.println(Week.Weekday.SATURDAY.isHoliday()); //true
        System.out.println(Week.Weekday.SUNDAY.isHoliday()); //true

        //Exercise 3.
        System.out.println(" --------------------------Exercise3: ");
        WrapperClass Execute = new WrapperClass();

        System.out.println("String values to the appropriate primitive data types: ");
        System.out.println("Boolean:  " + Execute.bl1);
        System.out.println("Byte: " + Execute.bt1);
        System.out.println("Short: " + Execute.s1);
        System.out.println("Integer: " + Execute.i1);
        System.out.println("Long: " + Execute.l1);
        System.out.println("Double: " + Execute.d1);
        System.out.println("Float: " + Execute.f1);

    }
}
