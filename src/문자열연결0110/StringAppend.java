package 문자열연결0110;
import java.util.Scanner;
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라, 두번째 문자열 앞에 추가하기
// 출력 : 정수값 입력이 2라면 ulkorea, 3이면 oulkorea
// 힌트 1 : substring(index) 문자열의 시작 위치부터 끝까지 추출
// 힌트 2 : substring 메소드를 이용해 문자열 추출하기 전에 index 계산이 필요함.
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String str1 = sc.next();
        System.out.print("두번째 문자열 입력 : ");
        String str2 = sc.next();
        System.out.print("정수 값 입력 : ");
        int value = sc.nextInt();

        String str3 = str1.substring(str1.length()-value);
        System.out.print(str3 + str2);
    }
}
