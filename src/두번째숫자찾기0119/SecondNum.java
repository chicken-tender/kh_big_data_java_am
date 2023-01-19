package 두번째숫자찾기0119;
import java.util.Arrays;
import java.util.Scanner;
// 임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번째로 등장하는 숫자의 위치 찾기
/*
임의의 수 입력 : 1 2 3 4 5 1 2 3 4 5
찾을 수 입력 : 5
출력 : 10
 */
// 만약에 2번째 등장하는 수가 없으면 -1 출력
public class SecondNum {
    public static void main(String[] args) {
        int[] num = new int[10];
        int cnt = 0;
        int p = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 수 : ");
        for(int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print("찾을 수 : ");
        int val = sc.nextInt();
        for(int i = 0; i < num.length; i++) {
            if(num[i] == val) {
                cnt++;
                p = (i+1);
            }
            if(cnt == 1) p = - 1;
            else if(cnt == 2) break;
        }
        System.out.println(p);
    }
}
