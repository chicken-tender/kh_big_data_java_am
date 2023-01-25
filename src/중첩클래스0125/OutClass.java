package 중첩클래스0125;

public class OutClass {
    private int num = 10; // 인스턴스 변수
    private static int sNum = 20; // 정적 변수 (클래스 소속의 변수)
    InClass inClass; // 아직 내부 클래스를 만들지 않았음
    public OutClass() { // 외부 클래스에 대한 생성자 호출
        inClass = new InClass();
    }
    class InClass {
        int inNum = 100;
        // static int sInNum = 200; <- JDK 11버전 기준으로는 내부 클래스에 정적변수 선언 불가
        void inTest() {
            System.out.println("외부 클래스의 인스턴스 변수 : " + num);
            System.out.println("외부 클래스의 정적 변수 : " + sNum);
        }
        // static void sTest() {} <- JDK 11버전 기준으로는 내부 클래스에 정적메소드 사용 불가
    }
    public void usingClass() {
        inClass.inTest();
    }
}
