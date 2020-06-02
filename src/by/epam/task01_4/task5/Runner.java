package by.epam.task01_4.task5;

import static by.epam.task01_4.task5.DataEntry.*;

public class Runner {
    public static void main(String[] args) {

        Manipulator manipulator;
        manipulator = new Manipulator();

        manipulator.setNumber(input());
        manipulator.printAllInfo();
    }
}
