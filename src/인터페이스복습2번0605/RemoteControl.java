package 인터페이스복습2번0605;

public interface RemoteControl {
    int MAX_VOLUME = 100; // 자동으로 final static이 추가됨.
    int MIN_VOLUME = 0;
    void turnON();       // 자동으로 public abstract가 추가됨.
    void turnOFF();
    void setVolume(int volume);
    static void changeBattery() { // 정적 메소드 이므로 상속되지 않음. 그래서 구현부가 있음.
        System.out.println("건전지를 교환 합니다.");
    }
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
}
