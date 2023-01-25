package 다운캐스팅0125;
import java.util.ArrayList;
// 다운 캐스팅? 상위 클래스 형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것
// instanceof : 형변환 가능 여부를 확인하는 용도(참조 변수가 참조하고 있는 객체의 실제 타입을 알아보기 위해 사용)
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();
    }
    public void addAnimal() {
        // ArrayList에 추가되면서 타입이 Animal 형으로 변환
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        for(Animal e : aniList) e.move();
    }
    public void testCasting() {
        for(int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i); // List의 해당 인덱스의 값을 가져옴
            // Human 타입으로 형변환 가능 여부 물어봄..(= 다운캐스팅)
            if(ani instanceof Human) {
                Human h = (Human) ani;
                h.readBook();
            } else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.fly();
            } else {
                System.out.println("지원 되지 않는 형 입니다.");
            }
        }
    }
}
