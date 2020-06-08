package by.epamtc.task01_4.task5;

public class Manipulator {
    private final int NUMBER = 123;

    public int getNumber() {
        return NUMBER;
    }

    private int takeHundred() {
        return NUMBER / 100;
    }

    private int takeTen() {
        return NUMBER % 100 / 10;
    }

    private int takeUnit() {
        return NUMBER % 10;
    }

    public int sumOfDigits() {
        return takeHundred() + takeTen() + takeUnit();
    }

    public int multiplicationOfDigits() {
        return takeHundred() * takeTen() * takeUnit();
    }

    public int swapTensAndHundreds() {
        return takeTen() * 100 + takeHundred() * 10 + takeUnit();
    }

    public int withThousands() {
        return takeUnit() * 1000 + NUMBER;
    }

    public void printAllInfo() {
        System.out.println("\nNumber: " + getNumber());
        System.out.println("Sum of digits: " + sumOfDigits());
        System.out.println("Multiplication: " + multiplicationOfDigits());
        System.out.println("Swap hundreds and tens: " + swapTensAndHundreds());
        System.out.println("Number with thousands: " + withThousands());
    }


}
