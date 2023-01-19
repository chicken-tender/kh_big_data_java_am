package 인터페이스리모컨0119;
import java.util.Scanner;

public class RemoConMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택하세요. [1]TV [2]오디오 : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel == 1) {
            rc = new Television();
            rc.turnOn();
            rc.setVol(30);
            rc.getInfo();
            rc.setMute(true); // default 메소드이고 부모에서 만든 메소드 사용
        } else {
            rc = new Audio();
            rc.turnOn();
            rc.setVol(140);
            rc.getInfo();
            rc.setMute(true); // default 메소드이며 오버라이딩 되어 있는 메소드 사용
            rc.setMute(false);
        }
        RemoteControl.changeBattery(); // 인터페이스 소속의 메소드
    }
}
