package 다형성복습0605;

public class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }
    public void drive(Vehicle vehicle) { // 부모 클래스의 참조변수 타입, 즉 객체를 매개변수로 넣어야 함.
        System.out.print(name + "의 ");
        vehicle.run();
    }
}
