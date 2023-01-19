package 인터페이스리모컨0119;

public class Audio implements RemoteControl {
    private int volume; // 인스턴스 필드(private으로 클래스 내부에서만 접근 가능)
    @Override
    public void turnOn() { // 인터페이스의 추상화 메소드를 쓸 때는 public 꼭 써줄것!
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVol(int volume) { // 볼륨 허용치를 절대 벗어나지 않는 메소드 생성
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
        System.out.println("현재 볼륨은 " + volume + " 입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if (mute) System.out.println("오디오를 무음 처리 합니다.");
            else {
                System.out.println("오디오를 무음 해제 합니다.");
                this.volume = RemoteControl.Basic_VOL;
                System.out.println("현재 볼륨은 " + volume + " 입니다.");
        }
        }
    }
