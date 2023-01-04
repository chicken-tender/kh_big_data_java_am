package 스위치문계산기;
import java.util.Scanner;
// 스위치문으로 계산기 만들기
// 예제: 자판기 구현해보기 ( 직접 해보자!! )
public class SwitchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식을 입력하세요. : "); // 한번만 입력 받아도 여러개 값 담을 수 있음. (공백 기준.nextLine()제외)
        int x = sc.nextInt(); // 연산자의 좌변값을 입력 받음
        char op = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출
        int y = sc.nextInt(); // 연산자의 우변값을 입력 받음
        switch(op) {
            case '+' :
                System.out.println("덧셈 : " + (x+y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x-y));
                break;
            case '*' :
                System.out.println("곱셈 : " + (x*y));
            case '/' :
                System.out.println("나눗셈 : " + (x/y));
                break;
            default: System.out.println("잘못 입력하셨습니다.");
        }
    }
}
