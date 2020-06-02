package by.epam.task01_4.task8;

public class Function {
    private int a;
    private int b;
    private final int c = 10;
    private int h;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void calculate() {
        int y;
        for (int i = a; i <= b; i += h) {
            y = i == 15 ? (i + c) * 2 : (i - c) + 6;
            System.out.println("x = " + i + "  -->  y = " + y);
        }
    }
}
