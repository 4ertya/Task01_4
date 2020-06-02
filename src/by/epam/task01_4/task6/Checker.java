package by.epam.task01_4.task6;


public class Checker {
    private long a = 2L;
    private long d = 3L;
    private long an;
    private long sum;
    DataEntry dataEntry;

    private long n;


    public void checkInt() {
        dataEntry=new DataEntry();
        a=dataEntry.input();
        d=dataEntry.input();
        sum = 0;
        for (n = 1; ; n++) {
            try {
                an = a + (n - 1) * d;
                sum = Math.addExact((int) sum, (int) an);
            } catch (ArithmeticException e) {
                checkInfo("int");
                break;
            }
        }
    }

    public void checkLong() {
        dataEntry=new DataEntry();
        a=dataEntry.input();
        d=dataEntry.input();
        sum = 0;
        for (n = 1; ; n++) {
            try {
                an = a + (n - 1) * d;
                sum = Math.addExact(sum, an);
            } catch (ArithmeticException e) {
                checkInfo("long");
                break;
            }
        }
    }

    private void checkInfo(String str) {
        System.out.println("\na1 = " + a);
        System.out.println("d = " + d + "\n");
        System.out.println("n = " + n);
        System.out.println("an = " + an);
        System.out.println("S(a...an-1) + an = " + sum + " + " + an + " - overflows a "+str);
    }

}

