package 인터페이스코코아톡0119;
import java.util.Scanner;
// CocoaTolk은 우리가 만들어야 하는 부분
// send() 메소드가 호출되면 적절한 네트워크가 연결되어 입력한 메시지와 수신 대상자에게 전달하는 형태
public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk();
        cocoaTalk.writeMsg();
        NetworkAdapter3 adapter3;
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크를 선택하세요. [1]Wi-Fi [2]5G : ");
        int sel = sc.nextInt();
        if(sel == 1) adapter3 = new Wifi();
        else adapter3 = new FiveG();
        cocoaTalk.send(adapter3);
    }
}
