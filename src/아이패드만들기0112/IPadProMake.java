package 아이패드만들기0112;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class IPadProMake {
    private int screen; // 화면 크기 : 11인치, 12.9인치
    private int color; // 색상 : 스페이스 그레이, 실버
    private int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    private int network; // 네트워크 : Wi-Fi, Wi-Fi+Cellular
    private String name; // 각인서비스 시 이름 저장
    private String productData; // 제품 생산 일자 (일련 번호 만들 때 사용)
    private String serialNum; // 제품 일련 번호 : iPad13128C2301121
    private static int cnt = 0; // 클래스 변수 : 객체 생성시 생성되지 않고 클래스 생성시 만들어짐.

    public IPadProMake(String name) {
        this.name = name;
        Date now = new Date(); // 현재의 시간 정보를 가져기 위해 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productData = sdf.format(now); // 시간 정보 중 "yyMMdd" 패턴으로 시간 정보 가져옴
        cnt++; // 생성자는 객체가 만들어질 때 호출 되므로 생성된 객체의 횟수를 확인하는 용도로 사용 가능
        productData += cnt; // yyMMdd + 생산대수 (한 세트로 만듬)

    }
    // 제품 구매에 대한 진행 여부를 묻는 메뉴 만들기
    public boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== iPad Pro 구입하기 ====");
        System.out.print("구입 하시려면 yes / 종료는 quit : ");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true;
        // else를 붙여서 false로 return 하나 안하나 똑같음
        return false;
    }
    // 화면 크기 정하기(인스턴스 변수로 값이 내부에서 저장되기 때문에 메인에선 몰라도 됨..따라서 void로..)
    public void setScreen() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("디스플레이 선택 [1]11인치, [2]12.9인치 : ");
            screen = sc.nextInt();
            if(screen == 1 || screen == 2) return; // 여기서 해당 메소드가 끝남!!
            System.out.println("디스플레이를 다시 선택 하세요.");
        }
    }
    public void setColor() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("컬러 선택 [1]스페이스 그레이, [2]실버 : ");
            color = sc.nextInt();
            if(color == 1 || color == 2) return;
            System.out.println("색상을 다시 선택 하세요.");
        }
    }
    public void setMemory() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("용량 선택 [1]128GB, [2]256GB, [3]512GB, [4]1TB : ");
            memory = sc.nextInt();
            if(memory >= 1 && memory <= 4) return;
            System.out.println("용량을 다시 선택 하세요.");
        }
    }
    public void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("네트워크 선택 [1]Wi-Fi, [2]Wi-Fi+Cellular : ");
            network = sc.nextInt();
            if(network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택 하세요.");
        }
    }
    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청하시겠습니까?");
        String service = sc.next();
        if(service.equalsIgnoreCase("yes")) {
            System.out.print("이름을 입력하세요. : ");
            name = sc.next();
        } // 끝나면 어차피 메소드 끝나기 떄문에 return 생략
    }
    // 일련 번호 만들기 : iPad + 11/13 + 128/256/512/1024 + W/C + 230112 + 생산댓수
    public void setSerialNum() {
        String scrStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + scrStr + memStr[memory] + netStr + productData;
    }
    // 제품 구매가 완료 되면 출고까지 30초 대기 -> 출고 하기 구현
    public void inProductPad() throws InterruptedException {
        int cnt = 0;
        while(true) {
            sleep(300);
            cnt++;
            System.out.print("<< iPad Pro 제작중 : [" + cnt + "%] >>");
            System.out.print("\r"); // 옛날 타자기 처럼 print의 첫번째 구간으로 돌아감
            if(cnt >= 100) break;
        }
    }
    public void productPad() {
        final String[] scrType = {"", "11인치", "12.9인치"}; // 변경 불가하다는 의미로 final(상수) 처리
        final String[] colorType = {"", "스페이스 그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "Wi-Fi", "Wi-Fi+Cellular"};
        System.out.println("==== iPad Pro가 출고 되었습니다. ====");
        System.out.println("디스플레이 : " + scrType[screen]);
        System.out.println("   색상   : " + colorType[color]);
        System.out.println("   용량   : " + memType[memory]);
        System.out.println("  네트워크 : " + netType[network]);
        System.out.println("   이름   : " + name);
        System.out.println("일련번호(S/N) : " + serialNum);
        System.out.println("-----------------------------------");
    }
}
