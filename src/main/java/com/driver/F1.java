package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Race", 1);
    }

    @Override
    public void changeSpeed(int speed, int direction) {
        int newGear = 1;
        if (speed > 250) newGear = 6;
        else if (speed > 200) newGear = 5;
        else if (speed > 150) newGear = 4;
        else if (speed > 100) newGear = 3;
        else if (speed > 50) newGear = 2;

        changeGear(newGear);
        super.changeSpeed(speed, direction);
    }
}
