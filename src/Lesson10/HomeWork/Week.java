package Lesson10.HomeWork;

public class Week {

    enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
        FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekday() {

            if (this != SATURDAY && this != SUNDAY) {
                return true;
            }
            return false;
        }

        boolean isHoliday() {
            if (this == SATURDAY || this == SUNDAY) {
                return true;
            }
            return false;
        }

    }
}
