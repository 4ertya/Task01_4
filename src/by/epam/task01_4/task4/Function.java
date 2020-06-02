package by.epam.task01_4.task4;

public class Function {
    private double x;
    private double result;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getResult() {
        return result;
    }

    public double calculate() {
        if (x <= 13) {
            return this.result = Math.pow(-x, 3) + 9;
        } else {
            return this.result = -3 / (x + 1);
        }
    }
}
