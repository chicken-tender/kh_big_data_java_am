//2023.01.02
package 변수의생존범위0102; //중괄호 범위 기준
import java.util.Scanner;
// 상수란? 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미.
// 변수와 다른 점은 프로그램이 실행되는 동안 값 변경이 안 됨.
// 자바에서 상수는 final 키워드로 정의하고 단 한번(선언과 동시에 초기화 권장)만 값을 설정할 수 있다.
public class ScopeData {
    public static void main(String[] args) {
        final double taxRate = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 수입을 입력하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야할 세금은 " + income * taxRate + "원 입니다.");
    }
}
