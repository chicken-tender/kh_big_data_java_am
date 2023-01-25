package 다중인터페이스0125;

public interface AirCon {
    // 인스턴스 필드x , 인터페이스 소속
    int MAX_TEMP = 30; // public final static이 자동으로 추가됨(컴파일러)
    int MIN_TEMP = 0; // public final static이 자동으로 추가됨(컴파일러)

    void airConON(); // 자동으로 추상 메소드가 됨 (abstract 자동 추가됨)
    void airConOFF();
    void setAirConTemp(int tmp);
}
