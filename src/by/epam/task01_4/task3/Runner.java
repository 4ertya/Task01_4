package by.epam.task01_4.task3;

public class Runner {
    public static void main(String[] args) {

        Function function;
        DataEntry dataEntry;

        function=new Function();
        dataEntry=new DataEntry();

        function.setA(dataEntry.input());
        function.setB(dataEntry.input());
        function.setC(dataEntry.input());
        function.calculate();
        function.printResult();
    }
}
