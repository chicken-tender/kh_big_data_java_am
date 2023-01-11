package TV만들기0111;
// TV 만들기
public class TV {
    private boolean isON; // 전원 버튼, 접근제한자는 private(같은 클래스 내에서만 접근 가능)
    private int channel; // 0 ~ 999
    private int volume; //  0 ~ 100

    TV() {
        isON = false;
        channel = 7;
        volume = 10;
        System.out.printf("기본 생성자 호출 전원 : %b채널 : %d볼륨 : %d\n",isON,channel,volume);
    }
    TV(boolean isON, int chl, int vol) {
        this.isON = isON;
        channel = chl;
        volume = vol;
    }
    // 외부에서 전원 on/off를 할 수 있는 기능을 제공(리모컨과 같은..)
    public void setON(boolean isON) {
        this.isON = isON;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV가 " + onOffStr + " 되었습니다.");
    }
    // 외부에서 채널을 변경할 수 있는 기능을 제공
    public void setChannel(int chl) {
        if(chl >= 0 && chl <= 999 ) {
            channel = chl;
            System.out.println("채널을 " + channel + "번으로 변경 하였습니다.");
        } else {
            System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }
    public void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "(으)로 변경 하였습니다.");
        } else {
            System.out.println("볼륨 설정 범위를 벗어났습니다.");
        }
    }
    public void getTV() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("=====TV 정보=====");
        System.out.println("전원 : " + onOffStr);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
    }

}
