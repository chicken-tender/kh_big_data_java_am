package 추상클래스복습0605;

// 추상 클래스는 '느슨한 결합 관계'를 만들기 위해서 사용 됨.
// 특징은 상속을 주는 부모는 객체를 만들 수 없음
// 추상 메소드를 상속 받으면 자식 클래스에서 해당 메소드를 반드시 구현해줘야 함.
// 단일 상속만 지원
public class AbstractEx05 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone14 Pro"); // 이 때, 부모 클래스 생성자도 호출됨.
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
