package Comparable예제1_0201;
import java.util.TreeSet;
// Comparable? 클래스 정렬을 구현할 수 있도록 해주는 인터페이스이며, TreeSet 컬렉션에서 사용해야 함.
// CompareTo() 메소드를 오버라이딩 해서 정렬조건을 구현해야 함. 정렬 조건은 자신의 객체와 매개변수로 입력 받은 객체를 비교
// 정렬 조건은 양의 정수 값을 반환하면 정렬 조건이 됨(반환값은 양수/음수/0)
// 양수 : 정렬 조건 , 음수 : 현 상태 유지, 0 : 동일하다
// 단, 정렬 조건을 0으로 반환하면 Set의 특성으로 인해 해당 객체가 표시 되지 않음. 따라서 하위 조건을 하나 더 넣어줘야 함)
public class Main {
    public static void main(String[] args) {
        TreeSet<CarSort> ts = new TreeSet<>();
        ts.add(new CarSort("테슬라", 2023, "Red"));
        ts.add(new CarSort("코나", 2019, "White"));
        ts.add(new CarSort("EV6", 2021, "White"));
        ts.add(new CarSort("티볼리", 2021, "Blue"));

        for(CarSort e : ts) {
            System.out.println("모델명 : " + e.modelName + " / 연식 : " + e.modelYear + " / 색상 : " + e.color);
        }
    }
}
