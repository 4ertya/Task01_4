package by.epam.task01_4.task7;

import static by.epam.task01_4.task7.DataEntry.*;

public class Runner {
    public static void main(String[] args) {

        Replacement replacement = new Replacement();

        replacement.setNumber(input());
        System.out.println(replacement.replace());
    }
}
