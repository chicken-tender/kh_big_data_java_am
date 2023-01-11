package 메소드연습0110;

public class Sample {
    // 생성자 생성시 인스턴스 필드에 값이 들어감.(초기화값)
    String name; // 인스턴스(필드) - 객체가 만들어질 때 함께 만들어지는 값

    // 생성자 : 클래스 이름과 동일하고 반환 타입이 없음, 클래스가 객체로 생성될 때 자동으로 호출
    // 생성자의 주요 목적 : 클래스 내부의 인스턴스 필드를 초기화
    Sample() {
        name = "anonymous";
    }
    // 동일 이름의 생성자가 여러개 만들어지면 생성자 오버로딩 관계가 만들어 진다.
    Sample(String name) {
        this.name = name; // this 는 추후에 설명...
    }

    // 이름을 읽는 메소드 (Getter)
    String getName() {
        return name;
    }

    // *** 동일 이름의 함수가 여러개 만들어지면 함수 오버로딩 관계가 만들어 진다.
    // 접근제한자가 없으면 default 특성을 가짐..-> 동일 패키지 내에서만 접근 가능
    int sum(int a, int b) { // 메소드 호출시 매개변수로 값을 전달함!!!
        return a + b; // 메소드 호출 결과를 정수값으로 반환!!!
    }
    // 메소드의 매개변수는 일반적으로 갯수가 정해져 있으나 경우에 따라 갯수를 알 수 없는 경우 ... 을 사용하면 됨.
    int sum(int ... values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    // 매개변수도 없고 반환값도 없는 메소드
    void say() {
        System.out.println(getName() + "안녕하세요");
    }

    String sayStr() {
        return "안녕하세요";
    }
}
