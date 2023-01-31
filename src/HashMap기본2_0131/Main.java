package HashMap기본2_0131;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("양콩미", 99);
        map.put("홍길동", 55);
        map.put("한석봉", 80);
        map.put("이순신", 96);
        map.put("홍길동", 88);
        System.out.println("총 Entry 수 : " + map.size()); // 4
        // 객체 찾기 (List는 인덱스로 찾지만 Map은 키 값으로 찾는다.)
        System.out.println(map.get("홍길동")); // 키가 같기 때문에 값이 나중의 값으로 대체됨
        // Map을 순회하는 방법 : 향상된 for문 사용
        for(String key : map.keySet()) { // 모든 키를 Set 객체에 담아서 리턴
            System.out.println(key + " : " + map.get(key));
        }
        // Map을 순회하는 방법 2 : 반복자로 순회하는 방법(iterator)
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) { // 키가 다음에 있는지 확인  ( 다음에 키가 존재하는지 확인 )
            String key = iterator.next(); // 키를 가져옴
            System.out.println(key + " : " + map.get(key));
        }
        // 객체 삭제
        map.remove("홍길동"); // 키로 Map.Entry를 제거
        System.out.println("총 Entry 수 : " + map.size());
        // 값을 수정하는 메소드
        map.replace("이순신", 91);
        // Map.Entry 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
