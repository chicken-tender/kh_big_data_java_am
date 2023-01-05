package 반복문유효값체크0104;
import java.util.Scanner;
// 반복문을 이용해서 유효값 체크 하기 (while 반복문을 사용)
// do ~ while() : 먼저 수행 후 조건 확인
public class ValidCheck {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        // while 문 예시
            while(true) { // 무한루프
            System.out.print("나이를 입력하세요. : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) break; // 나이 조건을 만족하면 무한루프 빠져나갈 수 있음.
            System.out.println("나이를 잘못 입력 하셨습니다.");
        } System.out.println("입력하신 나이는 " + age + " 입니다.");

        // do ~ while() 문 예시
        // 단점: 나이를 잘못 입력했을 경우 안내문까지 넣으려면 코드 추가 해야 함.
//        do {
//            System.out.print("나이를 입력하세요.");
//            age = sc.nextInt();
//        } while(age <= 0 || age >= 200);
//
//        System.out.println("입력하신 나이는 " + age + " 입니다.");
    }
}
