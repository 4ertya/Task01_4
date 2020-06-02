package by.epam.task01_4.task7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DataEntry {

    public static double input() {
        double temp;

        while (true) {
            System.out.print("Enter a number in format nnn,ddd : ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                temp = scanner.nextDouble();
                if (Pattern.matches("\\d{3}\\.\\d{3}", Double.toString(temp))) {
                    break;
                }
            }
            System.out.println("Enter a number in format nnn,ddd");
        }
        return temp;
    }
}
