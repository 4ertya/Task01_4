package by.epam.task01_4.task6;

import java.util.Scanner;

public class DataEntry {
    private int arg;

    public DataEntry() {
        arg = 97;
    }

    public int input() {
        int temp;

        while (true) {
            System.out.print((char) arg + " : ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()){
                temp = scanner.nextInt();
                arg+=3;
                break;
            } else{
                System.out.println("Enter a Integer");
            }
        }
        return temp;
    }
}
