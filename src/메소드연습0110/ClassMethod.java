package 메소드연습0110;
import java.util.Scanner;
// 메소드 이름 규칙은 변수명 규칙과 동일(대/소문자, _, $, 숫자 사용 가능 / camel 표기)
// 기본 형태 : 접근제한자 반환타입 메소드명(매개변수 목록) { 구현부; return }
public class ClassMethod {
    public static void main(String[] args) {
        Sample sample = new Sample(); // 클래스 내에 생성자가 없으면 기본 생성자가 호출됨!!
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 입력 : ");
        int n1 = sc.nextInt();
        System.out.print("정수값 입력 : ");
        int n2 = sc.nextInt();

        int rst = sample.sum(n1, n2); // sum()은 매개변수와 반환값이 있는 메소드
        System.out.println(rst);
        sample.say(); // System.out.println은 반환값이 있어야 출력 가능! 반환값 없으면 메소드만 써도 됨.
        System.out.println(sample.sayStr()); // return 값을 String으로 반환하기 때문에 System.out.print 출력 가능
    }
}