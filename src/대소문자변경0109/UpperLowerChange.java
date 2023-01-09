package 대소문자변경0109;
import java.util.Scanner;
// 영문자 소문자와 대문자로 이루어진 단어를 입력 받은 뒤, 대문자는 소문자로 소문자는 대문자로 변경하기
// 무조건 입력은 영문자 이다.
// abCdEF -> ABcDef
// 힌트 1 : 문자열에서 문자를 추출하는 메소드는 charAt()이다.
// 힌트 2 : 자바에서의 문자는 정수값으로 사용된다.
// 힌트 3 : 정수값으로 계산 후 출력시 (char)형 변환이 필요하다.
public class UpperLowerChange {
    public static void main(String[] args) {
        String str;
        int text;
        Scanner sc = new Scanner(System.in);
        System.out.print("영단어를 입력하세요. : ");
        str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            text = str.charAt(i);
            if(text >= 65 && text <= 90) System.out.print((char)(text + 32) + " ");
            if(text >= 97 && text <= 122) System.out.print((char)(text - 32) + " ");
        }
    }
}
// if(ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
