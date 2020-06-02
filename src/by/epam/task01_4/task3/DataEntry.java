package by.epam.task01_4.task3;

import java.util.Scanner;

public class DataEntry {
    private int arg;

    public DataEntry() {
        arg = 97;
    }

    public double input() {
        double temp;

        while (true) {
            System.out.print((char) arg + " : ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()){
                temp = scanner.nextDouble();
                arg++;
                break;
            } else{
                System.out.println("Enter a number from -1.7e+308 to 1.7e+308");
            }
        }
        return temp;
    }
}