package Comparator예제1_0201;
import java.util.TreeSet;
// Comparator? 정렬을 구현하는데 사용하는 인터페이스
public class Main {
    public static void main(String[] args) {
        // 아까는 정렬조건이 클래스에 있어서 상관없었는데 이번엔 클래스를 별도로 만들었기 때문에 정렬조건을 넣어줘야 한다.
        TreeSet<Fruit> ts = new TreeSet<>(new DescendComp());
        ts.add(new Fruit("포도", 5500));
        ts.add(new Fruit("사과", 12000));
        ts.add(new Fruit("딸기", 16000));
        ts.add(new Fruit("바나나", 5500));

        for(Fruit e : ts) {
            System.out.println(e.name + " / " + e.price);
        }
    }
}
