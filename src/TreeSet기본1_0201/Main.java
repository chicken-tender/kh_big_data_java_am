package TreeSet기본1_0201;
import java.util.Iterator;
import java.util.TreeSet;
// 검색 기능이 강화된 컬렉션
// 객체 삽입 시 자동으로 정렬이 이루어 지며 정렬은 이진검색(binary search) 트리로 구성
// 검색은 중위(Inorder) 순회 방식으로 이루어지고 자동으로 오름차순 정렬이 됩니다.
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for(Integer e : ts) System.out.print(e + " ");
        ts.remove(48); // 매개변수로 전달한 요소를 제거
        System.out.println();
        // iterator() 로 순회 : 반복자 (향상된 for문이 나오기 이전에 표준으로 사용하던 방식
        Iterator<Integer> iterator = ts.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // 요소의 갯수
        System.out.println("크기 : " + ts.size());

    }
}
