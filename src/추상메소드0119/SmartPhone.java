package 추상메소드0119;

public class SmartPhone extends Phone {
    SmartPhone(String name) { // 부모 생성자가 기본 생성자면 자동 호출인데 매개변수가 있는 생성자가 있으면 불러줘야 함.~~
        super(name);
    }

    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 구현");
    }

    public void internet() { // SmartPhone의 별도 메소드
        System.out.println("인터넷을 연결합니다.");
    }
}
