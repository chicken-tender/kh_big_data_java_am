package 클래스기본0110;
// 클래스이름 참조변수 = new 클래스이름();
public class BasicClass {
    public static void main(String[] args) {
        Car gv80 = new Car("GV80","Black","2023.01",240);
        Car venue = new Car("VENUE","White","2019.05",200);
        Car kona = new Car("CONA","Black","2021.05",200);

        gv80.setName("GV80 Sports");
        // gv80.name = "GV80 깡통"; // 인스턴스 앞에 private 하면 같은 클래스 내 메소드를 제외하곤 값을 변경할 수 없다.
        gv80.viewCar();
        venue.viewCar();
        kona.viewCar();
    }
}

// 접근제한자가 default인 클래스 생성 (동일한 패키지 내에서 접근 가능)
 class Car {
    static String manufacture = "현대자동차"; // 클래스 변수(넓은 의미에서 field). 객체 소속x 즉..고정된 값
    // static 붙이면 객체 소속이 아님... 클래스 소속..객체가 아님... 하나만 만들어짐
    private String name; // 인스턴스(객체) 필드 (클래스가 객체로 만들어질 때 객체의 갯수 만큼 생성됨...)
    String color; // 인스턴스 필드
    String productYear; // 인스턴스 필드
    int maxSpeed; // 인스턴스 필드

    // 생성자 : 클래스 이름과 동일하고 반환 타입 없다. void 조차 없다.
    // 생성자는 주로 객체 생성시 객체 내부의 필드를 초기화 하는 목적으로 사용됨.
    // 필드는 생성자의 매개변수로 전달 된다.
    Car(String name, String color, String year, int speed) {
        // 전달받은 매개변수와 객체 내부의 필드의 이름이 같은 경우는 숨겨진 this.를 적어야 함.
        // (컴파일러가 구분 못해서). 이름 다르면 this. 생략해도 됨
        this.name = name;
        this.color = color;
        productYear = year;
        maxSpeed = speed;
    }
    // Setter 메소드 : 인스턴스의 값을 설정하는 메소드
    void setName(String name) {
        this.name = name;
    }
    void setColor(String color) {
        this.color = color;
    }
    void viewCar() {
        System.out.println("제조사 : " + manufacture );
        System.out.println("이름 : " + name);
        System.out.println("출고 연도 : " + productYear);
        System.out.println("최고 속도 : " + maxSpeed);
        System.out.println("------------------------");
    }
 }
