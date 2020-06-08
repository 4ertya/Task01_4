package by.epamtc.task01_4.task7;

public class Replacement {
    private final double NUMBER = 123.456;

    public double getNumber() {
        return NUMBER;
    }

    public double replace() {
        return (int) NUMBER * 0.001 + (int) ((NUMBER - (int) NUMBER) * 1000);
    }


}
