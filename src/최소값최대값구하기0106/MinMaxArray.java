package 최소값최대값구하기0106;
import java.util.Arrays;
import java.util.Scanner;
// 정수 값 입력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
/*
 예시) 정수 값 입력 : 10
 1 3 5 7 2 4 10 20 15 10
 MIN : 1
 MAX : 20
 */
public class MinMaxArray {
    public static void main(String[] args) {
        // 키보드 입력을 위한 스캐너 생성
        // 정수값 입력을 받음
        // 입력 받은 변수의 크기만큼 배열 생성
        // 생성된 배열의 갯수만큼 순회 하면서(여기까지 성공...) 정수 값을 입력 받음
        // 값을 비교하기 위해서 기준 값이 필요한데 배열 0번째 값을 기준값으로 저장
        // 배열에서 제일 작은 값과 제일 큰 값을 찾음
        // 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 갯수 입력 : ");
        int arrNum = sc.nextInt();
        int[] arr = new int[arrNum];
        for(int i=0; i<arr.length; i++) {
            System.out.print("정수 값 입력 : ");
            arr[i] = sc.nextInt(); // 생성된 배열의 갯수 만큼 순회하면서 정수값을 입력 받음
        }
        // 값을 비교하기 위해서 기준 값이 필요한데 배열 0번째 값을 기준값으로 저장
        int min = arr[0];
        int max = arr[0];
        // 배열에서 제일 작은 값과 제일 큰값을 찾음
        for(int e : arr) {
            if(min > e) min = e;
            if(max < e) max = e;
        }
        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);
    }
}
