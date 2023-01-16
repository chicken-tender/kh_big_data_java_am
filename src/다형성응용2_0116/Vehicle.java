package 다형성응용2_0116;

public class Vehicle {
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}
class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}
class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}