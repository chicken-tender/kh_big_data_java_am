package 더하기사이클문제0206;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num;
        int newNum ;
        while(true) {
            newNum = ((num % 10) * 10) + ((num / 10 + num % 10) % 10);
            cnt++;
            num = newNum;
            if(newNum == tmp) break;
        }
        System.out.println(cnt);
    }
}