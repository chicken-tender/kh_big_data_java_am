package PC방알바문제0111;
import java.util.Scanner;
// 피시방에 피시가 100대 있음 (배열의 인덱스는 0 ~ 99)
// 손님들은 모두 자기가 앉고 싶어하는 자리가 있음
// 만약 자기가 앉고 싶어하는 자리에 다른 손님이 있으면 거절을 해야하고, 아니면 자리 사용 허가
/*
<입력>
손님의 수 : 3
손님이 앉고 싶어 하는 자리 번호 : 1 3 5
<출력>
거절 횟수 출력 : 0
 */
public class PcRoomEx {
    public static void main(String[] args) {
        int[] computer = new int[100];
        int rejectCnt = 0; // 거절 횟수
        int seatNum; // 손님이 원하는 좌석 번호를 입력 받기 위한 변수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 손님의 수를 입력 받음
        for (int i = 0; i < n; i++) {
            seatNum = sc.nextInt(); // 좌석번호는 1번부터 시작
            if (computer[seatNum - 1] == 1) { // 해당 배열의 값이 1이라는 건 이미 사용하고 있는 자리
                rejectCnt++;
            } else {
                computer[seatNum - 1] = 1; // 비어있는 자리를 사용함
            }
        }
        System.out.println(rejectCnt);
    }
}