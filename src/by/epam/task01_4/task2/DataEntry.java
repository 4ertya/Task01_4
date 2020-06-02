package by.epam.task01_4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataEntry {

    public static int input() {
        int temp;

        while (true) {
            System.out.print("Enter a day: ");
            Scanner scanner = new Scanner(System.in);
            try {
                temp = scanner.nextInt();
                if (temp<1||temp>365){
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter a number from 1 to 365");
            }
        }
        return temp;
    }
}