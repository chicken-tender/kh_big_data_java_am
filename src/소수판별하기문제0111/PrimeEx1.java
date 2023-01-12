package 소수판별하기문제0111;
import java.util.Scanner;
// 소수란?? 1과 자기자신 이외에는 나누어 지지 않는 수
// 1단계 : 소수 판별하기 OK
// 2단계 : 정수 값을 입력 받아, 입력 받은 정수값 미만의 소수의 합을 구하는 문제
// 문제를 푸는 방법 : 메소드를 호출시 정수 값을 입력해서 해당 정수가 소수이면 그 값을 반환
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int sum = 0; // 입력 받은 정수 미만의 소수의 합 누적
        // 반복문 수행 : 입력 받은 정수 미만의 값으로 메소드 호출 ( 12 => 2 ~ 11)
        for(int i = 2; i < num; i++) {
            sum += primeSum(i);
        }
        System.out.println("소수의 합 : " + sum);
    }

    // static 키워드로 선언되면 객체 생성시 생성이 안되고, 클래스 생성시 단 한번 만들어짐.
    // 해당 메소드 수행 후 반환 값이 true/false
    // 정수 값을 입력 받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환
    static int primeSum(int n) {
        boolean isPrime = true; // 기본값을 소수로 정함(처음에 2가 들어가면 if문 바로 탈출하기 때문에)
        for(int i = 2; i < n; i++) { // 1 혹은 입력 받은 값으로 나누면 무조건 소수가 되기 때문에 제외
            if(n % i == 0) isPrime = false;
    }
        if(isPrime) return n;
        else return 0;
   }

}
