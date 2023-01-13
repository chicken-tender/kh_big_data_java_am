package 오버라이딩제약0113;
public class Vehicle {
    // protected : 상속관계와 동일 패키지 내에서는 접근 가능하지만 main이나 외부에서는 접근 못 함
    protected int speed;
    protected String color;
    protected String name;
    // final은 최종 상태를 의미하며, 메소드에서 사용시 오버로딩이 불가함을 의미함.
    final void accelerator() {
        System.out.println("차의 속도를 증가 시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소 시킵니다.");
    }
}

class SportsCar extends Vehicle {
    private boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false; // 터보모드가 켜지면 차의 최고 속도를 증가 시키는 기능, 상속받은 기능이 아님.
        speed = 280; // Vehicle로 부터 상속 받음
        this.name = name; // 생성자로 부터 이름을 입력 받아 인스턴스 필드의 초기값으로 사용
        color = "Red";
    }

    // getter는 보통 값을 읽는 기능을 넣기 때문에 반환타입이 있음(?)
    int getSpeed() { // getter 라고 부름. (읽기 위한 목적으로 쓰는 의미인데 관례임.)
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean getTurbo() {
        return isTurbo;
    }
    // setter는 외부에서 내부에 있는 필드 값을 바꾸기 위한 기능
    void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보 모드 : " + isTurbo);
    }
}

class ElectricCar extends Vehicle {
    boolean isAutoDrv;
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    boolean getAutoDrv() {
        return isAutoDrv;
    }
    void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);
    }
}