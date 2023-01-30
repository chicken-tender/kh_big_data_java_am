package ArrayList예제0130;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// List 인터페이스란? 배열과 비슷한 구조를 가지며 하위에 ArrayLis, LinkedList, Vector 클래스로 구성됨.
// 요소의 저장 순서가 유지됨, 중복 저장 허용, 동적 할당 (크기 지정 안해도 됨), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입, 삭제는 느림(단, 맨 뒤의 삽입/삭제는 빠름)
// Vector : ArrayList와 동일, 멀티 스레드 환경을 위해 동기화 기능 지원하기 때문에 안정적이나 ArrayList 보다 느림.
// LinkedList : 물리적으로 연속된 공간이 아님, 참조로 다음 저장 위치를 가리킴. 삽입/삭제가 매우 빠름, 검색은 느림.
public class Main {
    public static void main(String[] args) {
        Integer[] data = {138, 150, 100, 20}; // 이미 만들어진 배열
        // List 인터페이스로 ArrayList 객체를 참조함.
        List<Integer> pitches = new ArrayList<>(Arrays.asList(data)); // asList()는 이미 만들어진 배열을 List에 추가
//        pitches.add("138"); // ArrayList 마지막에 값을 계속 추가 (이 때, 크기가 다시 증가함)
//        pitches.add("150");
//        pitches.add("100");
//        pitches.add(1, "140"); // 해당 인덱스에 값 추가 (성능에 영향을 미침)
//        System.out.println(pitches.get(3)); // 전달된 인덱스의 값을 반환
//        // System.out.println(pitches.get(4)); // 없는 인덱스를 전달하면 예외 발생(예외처리에서 죽지 않게 할 수 있음)
//        System.out.println(pitches);
//        System.out.println(pitches.size()); // ArrayList의 개수 반환
//        System.out.println(pitches.contains("150")); // 전달된 값이 ArrayList에 포함되어 있는지 boolean으로 반환
//        System.out.println(pitches.remove(1)); // 리스트에서 해당 항목을 삭제하고 삭제된 요소를 반환
//        System.out.println(pitches.remove("150")); // 리스트에서 해당 항목을 삭제하고 true/false로 반환

        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);
    }
}
