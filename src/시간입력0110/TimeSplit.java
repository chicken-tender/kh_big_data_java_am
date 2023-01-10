package 시간입력0110;
import java.util.Scanner;
// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력)
// 출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String time = sc.next();

        String[] time1 = time.split(":");
        int hour = Integer.parseInt(time1[0]);
        int minute = Integer.parseInt(time1[1]);
        int second = Integer.parseInt(time1[2]);

        if(hour >= 12 && hour <= 23) time1[0] = "오후 " + (hour - 12);
        else if(hour >= 0 && hour <= 11) time1[0] = "오전 " + hour;
        if(minute < 10) time1[1] = 0 + time1[1];
        if(second < 10) time1[2] = 0 + time1[2];

        System.out.println(time1[0] + "시 " + time1[1] + "분 " + time1[2] + "초");
    }
}
// 출력 다른 idea : %02d(두자리 정수를 받되 앞에 자리가 모자라면 0으로 채움)
// 이렇게 하면 minute, second 출력 if 안받고 바로 출력할 수 있음.