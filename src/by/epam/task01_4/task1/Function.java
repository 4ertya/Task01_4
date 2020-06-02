package by.epam.task01_4.task1;

public class Function {
    private double a;
    private double b;
    private double c;
    private double result;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public void printResult() {
        System.out.println("Result: " + getResult());
    }
}
