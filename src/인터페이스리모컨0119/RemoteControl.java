package 인터페이스리모컨0119;
// 인터페이스?
// 1. 모든 필드는 자동으로 상수(final static)으로 변환된다.
// 2. 모든 메소드는 자동으로 추상 메소드가 됩니다. (public abstract 자동 추가)
// 3. default 메소드는 예외적으로 구현부를 가질 수 있으며 상속 받은 클래스에서 재정의 가능
// 4. 정적 메소드를 포함할 수 있음 (정적 메소드는 객체와 상관없고 인터페이스 타입으로 사용됨)
public interface RemoteControl {
    int MAX_VOL = 100; // 상수로 정의하지 않았지만 정적인 상수이다.(인터페이스 생성 시 만들어지고 객체는 안됨)
    int MIN_VOL = 0; // 자동으로 final static으로 변환
    int Basic_VOL = 20;
    void turnOn();     // 자동으로 앞에 prblic abstract가 붙는다.(왜냐?인터페이스는 기본적으로 모든 메소드가 추상메소드기 때문)
    void turnOff();
    void setVol(int volume);
    void getInfo();

    // 자바 버전 1.8 이후에 추가 되었으며 예외적으로 메소드의 구현부를 가질 수 있습니다.
    // 뮤트 기능을 오디오에만 넣고 싶은데.. 추상화로 넣으면 상속받은 모든 클래스에 메소드 추가해줘야 함.
    // 클래스가 100000개면 너무 비효율적이기 때문에 유일하게 예외처리할 수 있는 것이 default!
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() { // 인터페이스 이름으로 접근해야 되고, 상속과는 무관함
        System.out.println("건전지를 교체해주십시오.");
    }
}
