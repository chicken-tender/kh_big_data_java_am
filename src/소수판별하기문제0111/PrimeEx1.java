package 소수판별하기문제0111;
import java.util.Scanner;
// 소수란?? 1과 자기자신 이외에는 나누어 지지 않는 수
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        boolean rst = isPrime(num);
        System.out.println("소수 여부 : " + rst);
    }

    // static 키워드로 선언되면 객체 생성시 생성이 안되고, 클래스 생성시 단 한번 만들어짐.
    // 해당 메소드 수행 후 반환 값이 true/false
    // 정수 값을 입력 받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환
    static boolean isPrime(int num) {
        // 1 혹은 입력 받은 값으로 나누면 무조건 소수가 되기 때문에 제외
        for(int i = 2; i < num; i++) {
            if(num % i != 0) return true;
        }
        return false;
    }
}
