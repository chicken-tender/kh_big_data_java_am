package 인터페이스리모컨0119;

public class Television implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
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
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    @Override
    public void getInfo() {
        System.out.println("현재 볼륨은 " + volume + " 입니다.");
    }
}