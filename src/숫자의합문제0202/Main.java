package 숫자의합문제0202;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sum = 0;
            String num = sc.next();
            int[] arr = new int[num.length()];
            for (int i = 0; i < num.length(); i++) {
                arr[i] = num.charAt(i) - '0';
                if(num.charAt(i) == 0) arr[i] = num.charAt(i) - '0' + 1;
            }
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if(sum == 0) System.exit(0);
            }
            System.out.println(sum);
        }
    }
}