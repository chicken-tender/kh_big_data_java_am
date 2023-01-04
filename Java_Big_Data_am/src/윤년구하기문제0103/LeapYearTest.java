//2023.01.03
package 윤년구하기문제0103;
import java.util.Scanner;
// 1. 4로 나누어지면 윤년
// 2. 100으로 나누어지면 윤년 아님
// 3. 400으로 나누어지면 윤년
public class LeapYearTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요. : ");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + "은 윤년 입니다.");
        } else {
            System.out.println(year + "은 윤년이 아닙니다.");
        }
    }
}
