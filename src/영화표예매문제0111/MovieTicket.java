package 영화표예매문제0111;
import java.util.Scanner;

public class MovieTicket {
    // 극장의 좌석 상태를 표시하는 배열 만들기(총 10개)
    int[] isSelect = new int[10];

    // 현재 좌석 상태를 보여주는 메소드 작성 (0이면 [ ], 1이면 [V])
    void printSeat() {
        for(int i = 0; i < isSelect.length; i++) {
            if(isSelect[i] == 0) System.out.print("[ ] ");
            else System.out.print("[V] ");
        }
        System.out.println();
    }

    // 좌석을 예약하는 메소드 작성
    void selectSeat() {
        // printSeat() 호출해 현재 좌석 상태를 보여줌
        printSeat();
        // 좌석번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 문구 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호 입력 : ");
        int seatNum = sc.nextInt();
        if(isSelect[seatNum-1] == 1) System.out.println("Error!!");
        else { // 좌석 예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여줌
            isSelect[seatNum-1] = 1;
            printSeat();
        }
    }

    int totalAmount() {
        // 좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를 누적
        int selectCnt = 0;
        for(int e : isSelect) {
            if(e == 1) selectCnt++;
        }
        int total = selectCnt * 12000;
        // 좌석 갯수와 좌석당 가격을 곱해서 결과를 반환
        return total;
    }

}
