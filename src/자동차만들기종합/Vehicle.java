package 자동차만들기종합;

import java.util.Scanner;

abstract class Vehicle {
    int speed;
    int mileage;
    int oilTank;
    int seat;
    String carName;

    public void setName(String carName) {
        this.carName = carName;
    }

    public String getName() {
        return carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public int getOilTank() {
        return oilTank;
    }

    public void setOilTank(int oilTank) {
        this.oilTank = oilTank;
    }
    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    abstract void addFunc();


}