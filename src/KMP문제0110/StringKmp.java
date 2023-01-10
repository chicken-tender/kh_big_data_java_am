package KMP문제0110;
import java.util.Scanner;
// 입력 : Kdnus-Mignet-Anne
// 출력 : KMA
public class StringKmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 하세요. : ");
        String name = sc.next();
        // split으로 찾기!
//        String[] kmp = name.split("-");
//        for(int i=0; i<kmp.length; i++) {
//            char firstName = kmp[i].charAt(0);
//            System.out.print(firstName);
//        }
        // 대문자만 찾는 방법!!
//        for(int i=0; i<name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));
//            }
//        }
        // 문자 배열로 변경 후 대문자 골라내기
        char[] kmp2 = name.toCharArray();
        for(int i = 0; i < kmp2.length; i++) {
            if(kmp2[i] >= 'A' && kmp2[i] <= 'Z') System.out.print(kmp2[i]);
        }
    }
}
// 향상된 for문으로 변경 후 해보기!
// 향상된 for문은 만들어진 배열(범위가 정해져있는)에서 사용