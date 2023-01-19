package 인터페이스네트워크0119;
import java.util.Scanner;

public class InterfaceMain {
    public static void main(String[] args) {
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택하세요. [1]Wi-Fi [2]5G [3]LTE : ");
        int network = sc.nextInt();
        switch (network) {
            case 1: adapter = new Wifi("SKT"); break;
            case 2: adapter = new FiveG("SKT"); break;
            case 3: adapter = new Lte("SKT"); break;
            default: System.out.println("네트워크를 잘못 선택하셨습니다.");
        }
        adapter.connect();
    }
}
