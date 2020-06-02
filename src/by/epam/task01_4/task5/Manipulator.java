package by.epam.task01_4.task5;

public class Manipulator {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int takeHundreds() {
        return number / 100;
    }

    private int takeTens() {
        return number % 100 / 10;
    }

    private int takeUnits() {
        return number % 10;
    }

    public int sum() {
        return takeHundreds() + takeTens() + takeUnits();
    }

    public int multiplication(){
        return takeHundreds()*takeTens()*takeUnits();
    }

    public int swapTensAndHundreds(){
        return takeTens()*100+takeHundreds()*10+takeUnits();
    }

    public int withThousands(){
        return takeUnits()*1000+number;
    }

    public void printAllInfo(){
        System.out.println("\nNumber: "+getNumber());
        System.out.println("Sum of digits: "+sum());
        System.out.println("Multiplication: "+multiplication());
        System.out.println("Swap hundreds and tens: "+swapTensAndHundreds());
        System.out.println("Number with thousands: "+withThousands());
    }


}
