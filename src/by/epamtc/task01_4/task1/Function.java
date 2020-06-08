package by.epamtc.task01_4.task1;

public class Function {
    private final double A = 2;
    private final double B = 3;
    private final double C = 4;


    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public double getResult() {
        double numerator;
        double denominator;

        numerator = B + Math.sqrt(Math.pow(B, 2) + 4 * A * C);
        denominator = 2 * A;

        return numerator / denominator - Math.pow(A, 3) * C + Math.pow(B, -2);
    }
}
