package by.epamtc.task01_4.task4;

public class Function {
    private final double X = 15;
    private double result;

    public double getX() {
        return X;
    }

    public double getResult() {
        return result;
    }

    public double calculate() {
        if (X <= 13) {
            return this.result = Math.pow(-X, 3) + 9;
        } else {
            return this.result = -3 / (X + 1);
        }
    }
}
