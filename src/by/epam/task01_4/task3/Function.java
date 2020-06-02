package by.epam.task01_4.task3;

public class Function {

    private double a;
    private double b;
    private double c;

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

    public void calculate(){
        if (a>b&&b>c){
            a=a*2;
            b=b*2;
            c=c*2;
        } else{
            a=Math.abs(a);
            b=Math.abs(b);
            c=Math.abs(c);
        }
    }

    public void printResult(){
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
    }
}
