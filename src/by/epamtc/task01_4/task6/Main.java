package by.epamtc.task01_4.task6;

public class Main {
    public static void main(String[] args) {
        ValueBoundary valueBoundary = new ValueBoundary();
        System.out.println("int overflow at n = " + valueBoundary.findNForOverflowInt());
        System.out.println("long overflow at n = " + valueBoundary.findNForOverflowLong());

    }
}
