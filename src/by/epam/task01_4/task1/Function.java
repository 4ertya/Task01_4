package by.epam.task01_4.task1;

public class Function {
    private final double a = 2;
    private final double b = 3;
    private final double c = 4;


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getResult() {
        double numerator;
        double denominator;

        numerator = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        denominator = 2 * a;

        return numerator / denominator - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
