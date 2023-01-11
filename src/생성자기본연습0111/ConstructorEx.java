package 생성자기본연습0111;
// 생성자란? 클래스를 객체로 만들 때 자동으로 호출(=new를 호출 할 때)되며, 생성자는 인스턴스 필드를 초기화 함
// 생성자는 인스턴스 피드를 초기화하는 것이 목적이다.
/*
생성자 만드는 규칙!
1. 생성자는 클래스 이름과 같아야 함.
2. 반환타입 없고 접근제한자만 올 수 있으나 private은 특별한 경우가 아니면 사용 안함...
3. 하나의 클래스는 여러개의 생성자를 가질 수 있음. 단, 오버로딩 생성 규칙에 맞아야 함. ***
 */
/*
오버로딩 규칙!
1. 데이터 타입이 같아도 갯수가 다르면 가능
2. 데이터 타입이 같고 갯수가 같을 경우, 변수명이 달라도 소용없음.
 */
public class ConstructorEx {
    public static void main(String[] args) {
        Car casper = new Car(); // 아무것도 없는 생성자 호출
        Car kona = new Car("코나");
        Car sorento = new Car("쏘렌토","2023");
        Car avante = new Car("아반떼","2019","White");

        casper.getCar();
        kona.getCar();
        sorento.getCar();
        avante.getCar();

    }
}

class Car {
    // 인스턴스 필드
    String name;
    String year;
    String color;

    // 아무것도 없는 생성자
    public Car() {}

    public Car(String name) {
        this.name = name;
    }
    public Car(String name, String year){
        this.name = name;
        this.year = year;
    }
    public Car(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    // 일반 메소드는 반환타입 꼭 적어줘야 함.
    void getCar() {
        System.out.println("이름 : " + name);
        System.out.println("연식 : " + year);
        System.out.println("색상 : " + color);
        System.out.println("------------------");
    }

}
