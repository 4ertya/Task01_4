package by.epam.task01_4.task2;

import java.util.Scanner;

public class DataEntry {

    public static int input() {
        int temp;

        while (true) {
            System.out.print("Enter a day: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (temp >= 1 && temp <= 365) {
                    break;
                }
            } else {
                System.out.println("Enter a number from 1 to 365");
            }
        }
        return temp;
    }
}