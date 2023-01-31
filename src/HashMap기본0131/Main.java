package HashMap기본0131;
import java.util.HashMap;
import java.util.Map;
// HashMap : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 hashCode()를 통해서 수행함.
// 키의 중복은 허용하지 않음, 값은 중복 가능, 순서 유지 하지 않음.
// 경우에 따라서 hashCode()와 equals() 메소드를 오버라이드 해서 사용해야 함.
// HashMap은 성능이 우수하고 멀티 스레드 환경을 지원하지 않음(즉, 동기화 기능 없음)
// HashTable은 HashMap 내부 구조와 동일하며, 멀티 스레드 지원
// Propertie는 HashTable을 상속 받아서 기능을 제약하여 사용(키와 값이 모두 문자열로만 구성), 정보를 "파일"에 저장하거나 읽기 위한 용도
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 객체 추가 : put(K,V)
        map.put("아메리카노", 3000);
        map.put("라떼", 3500);
        // 객체 찾기 : get(K) - return V
        System.out.println("값 읽기 : " + map.get("아메리카노"));
        // 객체 삭제 : remove(K) - return 삭제한 K의 V
        System.out.println("값 제거 : " + map.remove("라떼"));
        // 없는 값을 추가/삭제하면 null 값 반환
        System.out.println("값 읽기 : " + map.get("돌체라떼"));
        System.out.println("값 제거 : " + map.remove("돌체라떼"));
    }
}
