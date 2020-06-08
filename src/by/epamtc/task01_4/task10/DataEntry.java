package by.epamtc.task01_4.task10;

import java.util.Scanner;

public class DataEntry {

    public static int input() {
        int number = 0;
        while (true) {
            System.out.print("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Enter a number!");
            }
        }
        return number;
    }
}
