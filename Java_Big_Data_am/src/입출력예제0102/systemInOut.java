package 입출력예제0102;

import java.util.Scanner;

public class systemInOut {
    public static void main(String[] args) {
        String name = "양콩미";
        String address = "인천시 연수구";
        char gender = '여';
        int age = 30;
        int kor = 99;
        int eng = 83;
        int math = 75;
        // 자바 스타일 (메소드를 오버로딩 하는 방식)
        System.out.println("======== Java Style Output =======");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + math));
        System.out.println("평균 : " + ((double)(kor + eng + math)/3));

        // C언어 스타일(printf()-서식지정자 사용)
        // 서식지정자 : %d, %ld, %u, %f, %.2f, %s, %c, %%, %b 등등
        // 이스케이프시퀀스 : \n, \r, \t, \b, \\
        System.out.printf("======== C Style Output =======\n");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", address);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor+eng+math);
        System.out.printf("평균 : %.2f\n", (double)(kor+eng+math)/3);

        System.out.print("Apple\tBanana\tOrange\b\n");

        System.out.print("\"Enter\" 키를 입력 하시면 종료 됩니다.\n");
        System.out.println("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%\n", 25);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();
        }

    }
}
