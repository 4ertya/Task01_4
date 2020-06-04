package by.epam.task01_4.task10;

public class Runner {
    public static void main(String[] args) {
        Checker checker=new Checker();

        checker.check();
        System.out.println(checker.isIncreasingProgression());
        System.out.println(checker.isHasIdenticalNearby());
        System.out.println(checker.isChangingSings());

    }
}
