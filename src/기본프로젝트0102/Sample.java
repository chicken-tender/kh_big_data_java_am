package 기본프로젝트0102;// 접근제한자 : public, protected, default, private
/*
저자 : 정경수
날짜 : 2023.01.02 10:16
목적 : 자바 연습용 프로그램
 */
public class Sample { // 클래스 이름을 지정, 파일명과 클래스명(관례상 첫자는 대문자)이 같아야 함.
    // main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출함.
    // static은 메모리에 하나만 적재됨. main함수는 한 개만 있어야기 때문에 main이랑 같이 쓰인다.
    // void는 메소드 실행 이후의 반환 타입 중 하나, 반환 할 게 없다. 라는 의미임.
    // {}:중괄호 - 클래스, 메소드 등의 범위를 결정(변수의 생존주기와 관련 있음)
    // ():소괄호 - 메소드의 매개변수를 넣는 곳
    // []:대괄호 - 배열 등을 정의 할 때 사용
    public static void main(String[] args) {
        System.out.printf("Hello, Java!");
    }
}