package 반복문연습문제1번0105;
import java.util.Scanner;
// 양의 정수 n을 받아서 n * n 크기의 행렬을 출력하는 프로그램 작성. 값은 1부터 시작
/*
정수 값 : 3
1 2 3
4 5 6
7 8 9
 */
public class SquareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요. : ");
        int number = sc.nextInt();

        for(int i=1; i<=number * number; i++) {
            System.out.printf("%4d", i);
            if(i % number ==0) System.out.println();
        }
    }
}
