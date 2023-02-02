package 직각삼각형문제0202;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }
            int maxNum = num[0];
            int minNum = num[1];
            int b = num[2];

            for (int e : num) {
                if (e > maxNum) maxNum = e;
            }
            for (int e : num) {
                if (e < minNum) minNum = e;
            }
            for (int e : num) {
                if(e != maxNum && e != minNum) b = e;
            }
            if(num[0] == 0 && num[1] == 0 && num[2] == 0) break;
            if ((maxNum * maxNum) == (minNum * minNum) + (b * b)) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}