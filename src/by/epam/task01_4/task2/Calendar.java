package by.epam.task01_4.task2;

public class Calendar {

    private final int dayInYear = 56;

    public String getDate() {
        int day;
        int month;
        boolean hasMonth;

        day = dayInYear;
        month = 1;
        hasMonth = false;

        while (!hasMonth) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if ((day - 31) <= 0) {
                        hasMonth = true;
                        break;
                    }
                    day = day - 31;
                    month++;
                    break;

                case 2:
                    if ((day - 28) <= 0) {
                        hasMonth = true;
                        break;
                    }
                    day = day - 28;
                    month++;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if ((day - 30) <= 0) {
                        hasMonth = true;
                        break;
                    }
                    day = day - 30;
                    month++;
                    break;
            }
        }
        return "day: " + day + "\nmonth: " + month;
    }

}