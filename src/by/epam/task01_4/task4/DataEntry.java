package by.epam.task01_4.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataEntry {

    public static double input() {
        double temp;

        while (true) {
            System.out.print("Enter X: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                temp = scanner.nextDouble();
                break;
            } else {
                System.out.println("Enter a number from -1.7e+308 to 1.7e+308");
            }
        }
        return temp;
    }
}
