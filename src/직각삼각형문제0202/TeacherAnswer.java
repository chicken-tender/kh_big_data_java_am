package 직각삼각형문제0202;
import java.util.Arrays;
import java.util.Scanner;

public class TeacherAnswer {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        while(true) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i]; // 양의 정수만 들어오니까 0이면 탈출 가능 조건 성립
            }
            if(sum == 0) break;
            Arrays.sort(arr); // 오름차순 정렬
            if((arr[2] * arr[2]) == arr[0] * arr[0] + arr[1] * arr[1]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
