package 추상메소드0119;

public class AbstractMain2 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("아이폰12pro"); // 부모로부터 상속받은 자식클래스로 스마트폰 객체 생성
        smartPhone.setPower(true);
        smartPhone.call();
        smartPhone.internet();

        Phone phone = new SmartPhone("갤럭시s20"); // 부모 클래스로 스마트폰 객체 생성
        phone.setPower(true);
        phone.call();
        //phone.internet(); 은 부모가 모르는 메소드기 때문에 안 뜸.
    }
}
