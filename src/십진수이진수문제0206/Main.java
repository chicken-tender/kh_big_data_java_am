package 십진수이진수문제0206;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Double> arr2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true) {
            arr.add(n % 2);
            n /= 2;
            if(n < 1) break;
        }
        for(int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
        }
        System.out.println();
        for(int i = 0; i < arr.size(); i++) {
            arr2.add(arr.get(i) * Math.pow(2,i));
        }
        for(Double e : arr2) sum += e;
        System.out.printf("%.0f",sum);
    }
}
