package 반복문for문예제0105;

import java.util.Scanner;

// for 반복문 : for(초기식;조건식;증감식) {반복 수행 구간}
public class ForEx1 {
    public static void main(String[] args) {

        // for문 기본형태
//        for(int i = 1; i <= 100; i++) {
//            System.out.printf("%4d", i);
//            if(i % 10 == 0) System.out.println();
//        }

        // 누적 수 더하기
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
        // while문
//        while(num > 0) {
//            sum += num; // sum = sum + num;
//            num--;
//        }

        //for문
        for(int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("정수의 합은 : " + sum + "입니다.");
    }
}
