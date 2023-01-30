package X보다작은수문제0130;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 문제 : 정수 n개로 이루어진 배열 A와 정수 X가 주어진다. 이 때 A에서 X보다 작은 수를 모두 출력
// 입력1 : 10 5
// 입력2 : 1 10 4 9 2 3 8 5 7 6
// 출력 : 1 4 2 3
public class Main {
    public static void main(String[] args) {
        int val;
        int[] a = new int[2];
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < a[0]; i++) {
            val = sc.nextInt();
            arr.add(val);
        }
        for(Integer v : arr) {
            if(v < a[1]) System.out.print(v + " ");
        }
    }
}
