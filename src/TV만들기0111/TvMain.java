package TV만들기0111;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTV = new TV(); // 기본 생성자 호출
        TV lgTV = new TV(true, 34, 20); // 매개변수가 있는 생성자 호출

        lgTV.getTV();

        samsungTV.setON(true);
        samsungTV.setChannel(134);
        samsungTV.getTV();
    }

}
