package 제일큰값찾기0104;
import java.util.Scanner;

// 3자리 정수를 입력 받아서 100자리, 10자리, 1자리로 나누어 담고 이 중 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 정수를 입력 받기 위해 스캐너 객체 생성
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt(); // 키보드로부터 입력 받은 값 value에 담음
        int num100 = num / 100;
        int num10 = (num % 100) / 10;
        int num1 = num % 10;

//        if(num100 > num10) {
//            if(num100 > num1) System.out.println(num100);
//            else System.out.println(num1);
//        } else {
//            if(num10 > num1) System.out.println(num10);
//            else System.out.println(num1);
//            }

        if(num100 > num10) {
            System.out.println(Math.max(num100,num1));
            } else System.out.println(Math.max(num10,num1));
        }
    }
