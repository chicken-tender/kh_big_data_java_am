package 스트림예제1_0208;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 스트림? 함수형 프로그램을 이용해 다양한 데이터 소스(배열,프레임워크 등)를 표준화된 방법으로 다루기 위한 것
// 1. 자료의 대상과 상관없이 동일한 연산 수행
// 2. 내부 반복자 이용 (반복문 배제)
// 3. 스트림은 한번 생성 된 후 최종연산을 통해 소모되면 재사용 안됨(최종연산은 한번만 가능)
// 4. 원본 데이터 변경하지 않음
// 5. 지연 연산 지원, 병렬 처리 지원
// 스트림은 생성 -> 중개 연산 -> 최종 연산 순으로 진행 됩니다.
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // 스트림 생성,중간 연산,최종 연산
        // 5 이상인 수만 출력
//        list.stream().filter(s -> s.intValue() >= 5).forEach(e -> System.out.println(e));
//        list.stream().filter(s -> s.intValue() >= 5).forEach(System.out::println);

        // 요소 합계, 횟수 구하기
        int sum = list.stream().mapToInt(e -> e).sum(); // mapToInt(중간연산, int 스트림을 구성), sum(최종연산)
        int count = (int) list.stream().count(); // count()의 반환 타입은 long 이므로 변환 필요
        System.out.println("합계 : " + sum);
        System.out.println("횟수 : " + count);
    }
}
