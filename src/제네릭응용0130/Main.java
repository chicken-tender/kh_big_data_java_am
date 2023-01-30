package 제네릭응용0130;

public class Main {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        // Powder material = new Powder(); 와 같음
        powderPrinter.setMaterial(new Powder()); // Powder 타입의 객체를 생성해서 매개변수로 전달
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

        // GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
        // 타입 변수를 Material 자식 클래스만 들어올 수 있도록 제한했기 때문에 Water로 지정 불가 확인!!
        // 사용하려면 Material 상속 받으면 됨~
        // 실제로 클래스 설계할 때는 매개변수 다형성으로 사용하는게 나음.
        // 이 예제는 컬렉션 프레임워크 자료구조가 이런 식으로 사용되고 있음을 이해하기 위해 해본 것.
    }
}
