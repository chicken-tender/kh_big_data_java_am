package 중첩인터페이스0125;
// 중첩 인터페이스란? 클래스 내부에 선언한 인터페이스
// 주로 UI 프로그래밍에서 이벤트 처리를 위해 사용
public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch(); // touch() 메소드 호출, 등록된 Listener의 onClick()을 호출함

        button.setOnClickListener(new MessageListener());
        button.touch();
    }
}
