package by.epam.task01_4.task9;

public class Function {
    private long result;

    {
        result = 1;
    }


    public void calculate() {
        int temp = 1;
        for (int i = 2; i <= 10; i++) {
            temp = temp + i;
            result = result * temp;
        }
    }
    public void printInfo(){
        System.out.println("result = " + result);
    }
}
