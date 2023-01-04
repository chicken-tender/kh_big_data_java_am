package 나머지연산자문제0103;
import java.util.Scanner;
//2023.01.03
// 100의 자리 정수를 입력 받아서 3개의 변수(100자리/10자리/1자리)에 대입
public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수를 입력 하세요 : ");
        int num = sc.nextInt();
        int a, b, c;
        a = num / 100; // 100으로 나눈 몫을 취한다.
        b = (num % 100) / 10; // 100으로 나눈 나머지 값을 10으로 나눠 몫을 취한다.
        c = num % 10;
        System.out.println("100의 자리 : " + a);
        System.out.println("10의 자리 : " + b);
        System.out.println("1의 자리 : " + c);
    }
}
