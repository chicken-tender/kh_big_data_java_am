package 상근이알람0104;
import java.util.Scanner;
/*
 상근이라는 친구는 매일 학교를 지각합니다.
 창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려줍니다.
 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되도록 함.
 단, 24시간제로 설정함. 23:59 -> 00:00
 */
public class AlarmSet {
    public static void main(String[] args) {
        // 시간을 입력 받기 위해 스캐너 객체 생성
        // 생성된 객체로 시간과 분을 입력 받음 (24시간제)
        // 변수를 한 개 생성해서 입력받은 시간과 분을 모두 분으로 환산
        // 창영이가 알려준 방법대로 시간을 45분 이전으로 돌림(45를 빼줌)
        // 계산 결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력
        int realAlarmTime;
        int alarmSetHour;
        int alarmSetMinute;
        Scanner sc = new Scanner(System.in);
        System.out.print("기상 시간(HH) : ");
        int hour = sc.nextInt();

        System.out.print("기상 시간(MM분) : ");
        int minute = sc.nextInt();

        if(hour >= 24 || minute >= 60) return;

        int alarmTime = (hour * 60) + minute;
        realAlarmTime = alarmTime - 45;

        alarmSetHour = realAlarmTime / 60;
        alarmSetMinute = realAlarmTime % 60;
        if(alarmSetMinute < 0) {
            alarmSetHour = alarmSetHour + 23;
            alarmSetMinute = alarmSetMinute + 60;
        }

        System.out.printf("설정된 알람 시간 : %d시 %d분\n", alarmSetHour, alarmSetMinute);
    }
}
