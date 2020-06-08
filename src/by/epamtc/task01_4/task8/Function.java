package by.epamtc.task01_4.task8;

public class Function {
    private int a;
    private int b;
    private final int c = 10;
    private int h;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
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
