package by.epamtc.task01_4.task9;

public class Function {
    private long result;

    {
        result = 1;
    }


    public long calculate() {
        int temp = 1;
        for (int i = 2; i <= 10; i++) {
            temp = temp + i;
            result = result * temp;
        }
        return result;
    }

    public void printResult() {
        System.out.println("result = " + calculate());
    }
}
