package by.epamtc.task01_4.task10;

public class Main {
    public static void main(String[] args) {
        CheckSequence checkSequence = new CheckSequence();

        checkSequence.check();
        System.out.println(checkSequence.isIncreasingSequence());
        System.out.println(checkSequence.hasIdenticalNearby());
        System.out.println(checkSequence.isChangingSings());

    }
}
