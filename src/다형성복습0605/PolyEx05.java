package 다형성복습0605;
import java.util.Scanner;

// 다형성의 특성을 활용하여 여러가지 타입을 한가지 타입으로 처리하는 기술
// 즉, 부모 클래스 타입의 참조 변수로 자식 클래스의 인스턴스를 참조할 수 있음
public class PolyEx05 {
    public static void main(String[] args) {
        Driver driver1 = new Driver("홍길동");

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();

        System.out.print("운전할 차를 선택 하세요.[1]버스 [2]택시 [3]스포츠카 : ");
        Scanner sc = new Scanner(System.in);
        int sel = sc.nextInt();

        switch (sel) {
            case 1 : driver1.drive(bus); break;
            case 2 : driver1.drive(taxi); break;
            case 3 : driver1.drive(sportsCar); break;
        }
    }
}
