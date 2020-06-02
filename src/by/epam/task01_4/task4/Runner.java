package by.epam.task01_4.task4;

import static by.epam.task01_4.task4.DataEntry.*;

public class Runner {
    public static void main(String[] args) {

        Function function;

        function = new Function();

        function.setX(input());

        function.calculate();

        System.out.println("Result: " + function.getResult());
    }
}
