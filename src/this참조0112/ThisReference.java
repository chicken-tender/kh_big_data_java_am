package this참조0112;
// this : this 참조 변수는 자기자신의 객체 주소를 참조하는 변수(예. this.modelName == santafe.modelName)
                                                         // 내가 의미를 이해하기 편할라고 쓴것이지 절대적이지 않음.
// this() : 생성자에서만 사용 가능
// 같은 클래스 내에서 여러 개의 생성자가 만들어지는 경우(==생성자 오버로딩) 중복된 코드가 많이 생김. 이를 보완하기 위해서 사용
public class ThisReference {
    public static void main(String[] args) {

    }
}

class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    public Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName; // 내부 인스턴스 필드와 지역변수명이 같을 때 구분하기 위해서 사용
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(String modelName, int modelYear, String color) {
        this.modelName = modelName; // 내부 인스턴스 필드와 지역변수명이 같을 때 구분하기 위해서 사용
        this.modelYear = modelYear;
        this.color = color;
    }

    public Car() {
        this("싼타페",2022, "Black");
    }

    public Car(String model) {
        this(model, 2022, "red", 220);
    }
}
