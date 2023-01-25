package 자동차종합예제_강사님;

public class SportsCar extends Car{
    SportsCar(String name) {
        this.name = name;
        speed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    public void setMode(boolean isMode) {
        if(isMode) speed *= 1.2;
    }
}
