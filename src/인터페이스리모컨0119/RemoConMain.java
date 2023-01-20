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

        // 인터페이스는 자기 자신의 객체를 생성 못하지만 일회용으로 쓰고 버릴 수 있음.
        // 자기 자신 객체(?) 생성하고 아래 구현부를 만들면 가능 <- 익명의 객체임 이름 없음.
        RemoteControl remoteControl = new RemoteControl() {
            int volume;
            @Override
            public void turnOn() {
                System.out.println("플스5를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("플스5를 끕니다.");
            }

            @Override
            public void setVol(int volume) {
                if(volume > RemoteControl.MAX_VOL) {
                    this.volume = RemoteControl.MAX_VOL;
                } else if(volume < RemoteControl.MIN_VOL) {
                    this.volume = RemoteControl.MIN_VOL;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 Audio 볼륨 : " + this.volume);
            }

            @Override
            public void getInfo() {

            }
        }; // 끝났다는거 세미콜론 붙여서 알려줘야 함.
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
