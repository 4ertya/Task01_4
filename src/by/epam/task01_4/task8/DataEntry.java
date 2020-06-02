package by.epam.task01_4.task8;

import java.util.Scanner;


public class DataEntry {
    private int arg;

    public DataEntry() {
        this.arg = 97;
    }

    public int input() {

        int temp;

        while (true) {
            System.out.print((char) arg + " : ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                arg = (arg == 98) ? arg + 6 : arg + 1;
                break;
            }
            System.out.println("Enter a integer");
        }
        return temp;
    }
}
