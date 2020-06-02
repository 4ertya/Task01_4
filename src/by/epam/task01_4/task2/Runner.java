package by.epam.task01_4.task2;

import static by.epam.task01_4.task2.DataEntry.*;

public class Runner {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        calendar.setDayInYear(input());
        calendar.findMonth();
        calendar.findDay();
        calendar.printDate();
    }
}
