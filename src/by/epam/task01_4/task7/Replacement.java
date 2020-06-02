package by.epam.task01_4.task7;

public class Replacement {
    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double replace(){
        return (int) number * 0.001 + (int) ((number - (int) number) * 1000);
    }




}
