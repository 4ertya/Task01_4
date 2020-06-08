package by.epamtc.task01_4.task10;

import static by.epamtc.task01_4.task10.DataEntry.*;

public class CheckSequence {
    private int a;
    private int b;
    private boolean increasingSequence;
    private boolean identicalNearby;
    private boolean changingSings;

    {
        increasingSequence = true;
        changingSings = true;
    }

    public boolean isIncreasingSequence() {
        return increasingSequence;
    }

    public boolean hasIdenticalNearby() {
        return identicalNearby;
    }

    public boolean isChangingSings() {
        return changingSings;
    }

    public void check() {
        int n = 0;
        int temp;
        while (true) {
            temp = input();
            if ((temp == 0) && (n < 2)) {
                continue;
            } else if (temp == 0) {
                break;
            }
            a = b;
            b = temp;
            if (n >= 1) {
                checkIncreasingSequence();
                checkIdenticalNearby();
                checkChangingSigns();
            }
            n++;
        }
    }

    public void checkIncreasingSequence() {
        if (b <= a) {
            increasingSequence = false;
        }
    }

    public void checkIdenticalNearby() {
        if (a == b) {
            identicalNearby = true;
        }
    }

    public void checkChangingSigns() {
        if (a < 0 && b < 0) {
            changingSings = false;
        }
        if (a > 0 && b > 0) {
            changingSings = false;
        }
    }
}

