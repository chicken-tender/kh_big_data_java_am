package 함수형프로그램예제1_0208;
// 함수형 프로그램이란? 자바8 도입, 수학공식과 유사, 불변성의 원칙, 조건문/반복문 사용 금지
// 람다(Lambda)? 화살표 표현식, 생략 가능한 모든 것을 생략함
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로 반드시 함수형 인터페이스가 필요함
@FunctionalInterface
interface MyCalculator {
    int sum(int a, int b);
}
@FunctionalInterface
interface MyFuncInterface {
    void method(int x);
}
@FunctionalInterface
interface MyFuncInterface2 {
    int min(int x, int y);
}
public class Main {
    public static void main(String[] args) {
//        MyCalculator mc = (a, b) -> a + b;
//        int rst = mc.sum(3,4);
//        System.out.println(rst);
//        MyFuncInterface mf = x -> {
//            int result = x * 5;
//            System.out.println(result);
//        };
//        mf.method(4);
        MyFuncInterface2 mf2 = (x,y) -> x < y ? x : y;
        System.out.println(mf2.min(3,5));

    }
}
