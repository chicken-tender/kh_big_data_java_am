package 십진수이진수문제0206;
import java.util.Scanner;
// 10진수를 입력 받아 2진수로 변경 후 다시 10진수 변경
// 배열을 사용하지 않고 정수 타입 변수를 이용하여 변환 (단, 문자열 사용X)
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = decToBin(n); // DecToBinEx.decToBin()과 같음. 같은 클래스 내라 static으로 메소드 선언하면 클래스명 생략 가능
        System.out.println(n);
        n = binToDec(n);
        System.out.println(n);
    }

    static int decToBin(int dec) { // 10진수를 입력 받아서 2진수 반환
        int calc; // 계산으로 만들어진 이진수
        int bin = 0; // 최종 결과
        int pos = 1; // 자리 이동을 위한 포지션 변수
        while(dec != 0) {
            calc = dec % 2; // 2로 나눈 나머지 대입
            bin = bin + calc * pos;
            dec = dec / 2;
            pos = pos * 10;
        }
        return bin;
    }
    static int binToDec(int bin) { // 2진수를 입력 받아 10진수 반환
        int dec = 0; // 최종 결과
        int i = 0; // 인덱스 계산용 변수
        int tmp; // 계산을 위한 임시 값 저장용
        while(bin != 0) {
            tmp = bin % 10; // 10으로 나눈 나머지 구함
            bin = bin / 10;
            dec += tmp * Math.pow(2, i++);
        }
        return dec;
    }
}
