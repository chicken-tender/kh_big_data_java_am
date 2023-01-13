package 홀수짝수나누어담기0112;
import java.util.Scanner;
// 정수 7개를 입력 받음 (배열 생성 필요)
// 정수 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
public class OddEvenSeparator {
    int[] inputArr = new int[7];
    int[] oddArr = new int[7]; // 홀수
    int[] evenArr = new int[7];
    int oddIdx = 0;
    int evenIdx = 0;

    // 정수 7개 입력 받기
    void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 7개를 입력하세요. : ");
        for(int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
    }
    // 홀수 / 짝수 나누어 담기
    void separatorArray() {
        for(int e : inputArr) {
            if(e % 2 == 0) evenArr[evenIdx++] = e;
            else oddArr[oddIdx++] = e;
        }

    }
    // 홀수 / 짝수 배열 출력
    void printArray() {
        System.out.print("홀수 : " );
        for(int i = 0; i < oddIdx; i++) System.out.print(oddArr[i] + " ");
        System.out.println();
        System.out.print("짝수 : " );
        for(int i = 0; i < evenIdx; i++) System.out.print(evenArr[i] + " ");
    }
}
