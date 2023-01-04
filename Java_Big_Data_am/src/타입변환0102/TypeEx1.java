//2023.01.02
package 타입변환0102;
// 타입 변환이란? 하나의 타입을 다른 타입으로 변경하는 것
// 자동 형변환 : 컴파일럭가 유리한 방향(데이터 크기가 더 큰 것)으로 형을 변경해주는 것
// 명시적 형변환 : 개발자가 의도한대로 형변환 하는 것
// 메소드를 이용한 형변환 : Integer.parseInt(); 문자열->정수로 변경
// Double.parseDouble() : 문자열->실수로 변경
// 진법 표현 : 16진법, 10진법, 8진법, 2진법
public class TypeEx1 {
    public static void main(String[] args) {
//        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2; // 문제가 발생하는 코드 * 정수 / 정수 = 정수
//        double result2 = (double)num1 / num2;
//        double result3 = 100 + 100.1;
//        System.out.println(result1); // 0.0
//        System.out.println(result2); // 0.25
//        System.out.println(result3);
//
//        String phoneNumber = "01057794921";
//        String name = "양콩미";
//
//        int number = Integer.parseInt(phoneNumber);
//        System.out.println(number);
//
//        String rate = "3.14394";
//
//        double rate1 = Double.parseDouble(rate);
//        System.out.println(rate1);
    int var1 = 0b1010; // 0b(2진수)
    int var2 = 399; // 10진수
    int var3 = 0x34fe; // 0x(16진수)
    System.out.println("var1 : " + var1);
    System.out.println("var2 : " + var2);
    System.out.println("var3 : " + var3);
    }
}
