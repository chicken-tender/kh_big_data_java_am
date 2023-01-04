package 조건문연습문제1_0103;
import java.util.Scanner;
// 성적을 입력 받음
// 입력 받은 값이 0 ~ 100 사이가 아니면 "잘못 입력 하였습니다." 출력
// 90점 이상:A , 80점 이상:B, 70점 이상:C, 60점 이상:D, 나머지:F 출력
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. : ");
        int score = sc.nextInt();
        // 내 코드
//        if(score >= 90 && score <= 100) {
//            System.out.println("A");
//        } else if(score >= 80 && score < 90) {
//            System.out.println("B");
//        } else if(score >= 70 && score < 80) {
//            System.out.println("C");
//        } else if(score >= 60 && score < 70) {
//            System.out.println("D");
//        } else if(score >= 0 && score < 60) {
//            System.out.println("F");
//        } else {
//            System.out.println("잘못 입력 하였습니다.");
//        }
        // 선생님 코드
        if(score >= 0 && score <= 100) {
            if(score >= 90) System.out.println("A"); // 내부 코드가 한 줄이면 중괄호 생략 가능
            else if(score >= 80) System.out.println("B");
            else if(score >= 70) System.out.println("C");
            else if(score >= 60) System.out.println("D");
            else System.out.println("F");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
