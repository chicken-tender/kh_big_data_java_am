package 메소드연습0110;

public class Sample {
    // 접근제한자가 없으면 default 특성을 가짐..-> 동일 패키지 내에서만 접근 가능
    int sum(int a, int b) { // 메소드 호출시 매개변수로 값을 전달함!!!
        return a + b; // 메소드 호출 결과를 정수값으로 반환!!!
    }

    // 매개변수도 없고 반환값도 없는 메소드
    void say() {
        System.out.print("안녕하세요");
    }

    String sayStr() {
        return "안녕하세요";
    }
}
