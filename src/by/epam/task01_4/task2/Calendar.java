package by.epam.task01_4.task2;

public class Calendar {
    private int dayInYear;
    private final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] months = {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"};
    private String month;
    private int day;

    public void setDayInYear(int dayInYear) {
        this.dayInYear = dayInYear;
    }

    public String findMonth() {
        day = dayInYear;

        for (int i = 0; i < months.length; i++) {
            day = day - daysInMonths[i];
            if (day <= 0) {
                day = day + daysInMonths[i];
                return month = months[i];
            }
        }
        return null;
    }

    public int findDay() {
        return day;
    }

    public void printDate() {
        System.out.println("Date: " + month + ", " + day);
    }


}

