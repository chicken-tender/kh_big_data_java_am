package 상속과인터페이스0119;
import java.util.Scanner;

public class Interface2 {
    public static void main(String[] args) {
        // NetworkAdapter2 adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크를 선택하세요. [1]Wi-Fi [2]5G : ");
        int num = sc.nextInt();

        if(num == 1) {
            WiFi wifi = new WiFi("SKT","홍길동");
            wifi.connect();
            wifi.sendMsg();
            wifi.rcvMsg();
        } else {
            FiveG fiveg = new FiveG("KT", "임꺽정");
            fiveg.connect();
            fiveg.sendMsg();
            fiveg.rcvMsg();
        }
    }
}
// 문법적으로는 적합하나 메신저 기능과 네트워크 연결이 묶여있기 때문에 동적바인딩 불가로 좋은 설계는 아님.
// 원하는 방향은 문자를 보낼 때 자동으로 적합한 네트워크 연결
// 원하는 방향의 코드는 '인터페이스코코아톡'패키지에 구현