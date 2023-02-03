package 알고리즘문제_8진수0203;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] arr2 = {"","1", "10", "11", "100", "101", "110", "111"};
        ArrayList<String> rst = new ArrayList<>();
        String num = sc.next();
        for(int i = 0; i < num.length(); i++) {
            if(num.length() == 1 && num.charAt(0) - '0' == 0) {
                System.out.println("0");
                break;
            }
            if(i == 0) {
                System.out.print(arr2[num.charAt(0) - '0']);
            } else {
                System.out.print(arr1[num.charAt(0) - '0']);
            }
        }
    }
}
