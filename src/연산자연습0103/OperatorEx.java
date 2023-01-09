//2023.01.03
package 연산자연습0103;
import java.util.Scanner;
// 이항연산자, 삼항연산자
// 산술연산자 : + - * / %
// 대입연산자 : =(대입은 항상 뒤에서 앞으로 일어남)
// 복합대입연산자 : += -= *= /= %= (연산 후 대입)
// 증감연산자 : ++ -- (값을 1증가 하거나 감소 시키는 연산자.. 단항 연산자)
// 앞에 붙으면 : 증가(감소)시키고 대입, 뒤에 붙으면 : 대입 후 증가(감소)
// 비교연산자 : < <= > >= == !=
// 논리연산자 : 참과 거짓을 판단(&& || !)
// 삼항연산자 : 항이 3개인 연산자 (조건문) 예.(조건문) ? 값(true일 때) : 값(false일 때)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자(+)
public class OperatorEx {
    public static void main(String[] args) {
        int num1 = 10, num2 = 40;
        System.out.println("+ 연산자 : " + (num1 + num2));
        System.out.println("- 연산자 : " + (num1 - num2));
        System.out.println("* 연산자 : " + (num1 * num2));
        System.out.println("/ 연산자 : " + (num1 / num2)); //몫을 구할 경우
        System.out.println("/ 연산자 : " + ((double)num1 / num2)); //결과값을 구할 경우, 형변환
        System.out.println("% 연산자 : " + (num1 % num2));
        System.out.println();

        int num3 = 10;
        System.out.println(num3 += 2); // num1 = num1 + 2;
        System.out.println(num3 -= 2); // num1 = num1 - 2;
        System.out.println(num3 *= 2); // num1 = num1 * 2;
        System.out.println(num3 /= 2); // num1 = num1 / 2;
        System.out.println(num3 %= 2); // num1 = num1 % 2;
        System.out.println();

        int num4 = 10;
        System.out.println(num4++);
        System.out.println(num4);
        System.out.println(++num4);
        System.out.println();

        int x = 10, y = 20;
        System.out.println(x > y); //false
        System.out.println(x >= y);
        System.out.println(x < y); //true
        System.out.println(x <= y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println();

        int num5 = 10, num6 = 20;
        boolean rst1, rst2, rst3;
        rst1 = (num5 > num6) && (num5 > 5);
        rst2 = (num5 > num6) || (num5 > 5);
        rst3 = !((num5 > num6) || (num5 > 5));
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요. : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;
        System.out.println(isAdult);

    }
}
