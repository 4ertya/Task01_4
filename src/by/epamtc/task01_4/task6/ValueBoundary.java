package by.epamtc.task01_4.task6;


public class ValueBoundary {
    private final int A = 100000000;
    private final int D = -9999999;
    private int n;
    boolean isOverflow;

    public int findNForOverflowInt() {
        int an;
        int currentSum;
        int previousSum;
        currentSum = 0;
        n = 0;
        isOverflow = false;

        while (!isOverflow) {
            n++;
            an = A + (n - 1) * D;
            previousSum = currentSum;
            currentSum = previousSum + an;
            if (((previousSum ^ currentSum) & (an ^ currentSum)) < 0) {
                isOverflow = true;
            }
        }
        return n;
    }


    public int findNForOverflowLong() {
        long an;
        long currentSum;
        long previousSum;
        currentSum = 0;
        n = 0;
        isOverflow = false;

        while (!isOverflow) {
            n++;
            an = (long) A + (n - 1) * (long) D;
            previousSum = currentSum;
            currentSum = previousSum + an;
            if (((previousSum ^ currentSum) & (an ^ currentSum)) < 0) {
                isOverflow = true;
            }
        }
        return n;
    }

}

