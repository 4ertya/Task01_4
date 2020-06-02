package by.epam.task01_4.task5;

import java.util.Scanner;

public class DataEntry {

    public static int input() {
        int temp;

        while (true) {
            System.out.print("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                break;
            } else {
                System.out.println("Enter a number from 100 to 999");
            }
        }
        return temp;
    }
}
