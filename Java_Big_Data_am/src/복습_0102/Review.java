package 복습_0102;

import java.util.Scanner;
import java.lang.String;

public class Review {
    public static void main(String[] args) {

        Scanner km = new Scanner(System.in);

        System.out.print("이름을 입력 하세요 : ");
        String name = km.nextLine();

        System.out.print("주소를 입력 하세요 : ");
        String address = km.nextLine();

        System.out.print("성별을 입력 하세요 : ");
        char gender = km.next().charAt(0);

        System.out.print("나이를 입력 하세요 : ");
        int age = km.nextInt();

        System.out.println("====회원 정보 출력====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
    }
}
