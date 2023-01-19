package 인터페이스코코아톡0119;
import java.util.Scanner;
// 메신저 기능에 대한 클래스
public class CocoaTalk {
    private String to; // 상대방 이름
    private String msg; // 전달할 메시지
    public CocoaTalk() { // 생성자 호출시 상대방 이름을 넣도록..
        Scanner sc = new Scanner(System.in);
        System.out.print("받는 사람 : ");
        to = sc.next();
        this.to = to;
    }
    public void writeMsg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("메시지 : ");
        msg = sc.nextLine();
        this.msg = "To. " + to + " : " + msg;
    }
    public void send(NetworkAdapter3 na) {
        na.send(msg);
    }
}
