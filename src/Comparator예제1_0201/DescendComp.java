package Comparator예제1_0201;
import java.util.Comparator;
// 정렬 방식을 정하는 클래스 생성
// Comparator는 매개변수로 들어오는 2개를 비교하는 인터페이스
// Comparable은 나 자신과 매개변수로 들어오는 데이터를 비교하는 인터페이스
public class DescendComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price == o2.price) {
            return o1.name.compareTo(o2.name);
        }
        return o2.price - o1.price; // 큰 값 부터 작은 값 순서로 정렬 (내림차순)
    }

    @Override
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }
}
