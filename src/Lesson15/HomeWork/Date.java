package Lesson15.HomeWork;


public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay(int i) {
        return day;
    }

    public void setDay(int day) {
        this.day = validationDay(day);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = validationMonth(month);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(int day, int month, int year) {
        this.day = validationDay(day);
        this.month = validationMonth(month);
        this.year = year;
    }

    public void displayDate (){
        System.out.println(day + "/" + month + "/" + year);


    }
    public int validationMonth (int month){
        while (month <= 1 || month >= 12) {
            System.out.println("The value for the month is not in the range 1 - 12");
            break;

        }

        return month;

    }
    public int validationDay (int day){
        while (day <= 1 || day >= 31) {
            System.out.println("The value for the day is not in the range 1 - 31");
            break;

        }
        return day;

    }
}
