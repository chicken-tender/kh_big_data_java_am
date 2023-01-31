package HashSet집합0131;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// 합집합 : 두 개의 요소에서 어느 한 쪽에만 존재해도 결과에 반영(단, 동일한 값이 양쪽에 존재하는 경우 중복은 제거됨.하나만 살아남음)
// 교집합 : 두군데 모두 존재하는 값만 결과에 반영
// 차집합 : 앞의 요소에서 뒤의 요소를 제거한 나머지를 결과에 반영
public class Main {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
//        s1.addAll(s2); // 합집합
//        System.out.println(s1); // 1 2 3 4 5 6 7 8 9
//        s1.retainAll(s2); // 교집합
//        System.out.println(s1); // 4 5 6
        s1.removeAll(s2); // 차집합
        System.out.println(s1); // 1 2 3
    }
}
