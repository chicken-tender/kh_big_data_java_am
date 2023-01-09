//2023.01.03
package 입출력실습예제0103;
// 이름, 주소, 성별, 나이, 전화번호를 입력 받아서 출력해보기!!

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next(); //next(); 쓰면 버퍼 생길 수 있음.
        sc.nextLine(); // 버퍼 지우기(쓰레기 값 남은걸 nextLine에 담아서 버리는 것)

        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();

        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("전화번호를 입력하세요 : ");
        String phoneNumber = sc.nextLine();

        System.out.println("=====회원정보=====");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", address);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("전화번호 : %s\n", phoneNumber);
    }
}
