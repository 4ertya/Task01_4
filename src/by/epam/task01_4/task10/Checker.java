package by.epam.task01_4.task10;

import static by.epam.task01_4.task10.DataEntry.*;

public class Checker {
    private int a;
    private int b;
    private boolean increasingProgression;
    private boolean hasIdenticalNearby;
    private boolean changingSings;

    public boolean isIncreasingProgression() {
        return increasingProgression;
    }

    public boolean isHasIdenticalNearby() {
        return hasIdenticalNearby;
    }

    public boolean isChangingSings() {
        return changingSings;
    }

    {
        increasingProgression = true;
        changingSings = true;
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
                increasingProgression();
                hasIdenticalNearby();
                changingSigns();
            }
            n++;
        }
    }

    public void increasingProgression() {
        if (b <= a) {
            increasingProgression = false;
        }
    }

    public void hasIdenticalNearby() {
        if (a == b) {
            hasIdenticalNearby = true;
        }
    }

    public void changingSigns() {
        if (a < 0 && b < 0) {
            changingSings = false;
        }
        if (a > 0 && b > 0) {
            changingSings = false;
        }
    }
}

