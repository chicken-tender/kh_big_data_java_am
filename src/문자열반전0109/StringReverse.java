package 문자열반전0109;
import java.util.Scanner;
// abcdefg -> gfedcba
public class StringReverse {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("영문자를 입력해주세요. : ");
        str = sc.next();

        for(int i=str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
