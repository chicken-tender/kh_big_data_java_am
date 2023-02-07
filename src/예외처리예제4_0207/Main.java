package 예외처리예제4_0207;
import java.util.Scanner;
// ArithmeticException : 연산 오류
public class Main {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch(ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                continue;
            }
            System.out.println("결과는 " + rst);
            break;
        }
    }
}
