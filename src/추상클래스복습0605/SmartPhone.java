package 추상클래스복습0605;

public class SmartPhone extends Phone {

    public SmartPhone(String name) { // 부모 생성자가 매개변수를 가지고 있기 때문에 명시적으로 달아줘야 함.
        super(name); // 부모 생성자 호출
    }
    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 완성 합니다.");
    }
    public void internet() {
        System.out.println("인터넷 기능을 완성 합니다.");
    }
}
