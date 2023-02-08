package 스트림예제5_0208;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
public class Main {
    public static void main(String[] args) {
        // 스트림 필터링
        // filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
        // distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 반환
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 3, 5, 4, 5, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 3, 5, 4, 5, 6);
        // 스트림에서 홀수 값만 골라내기
        stream1.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));

        System.out.println();

        // 스트림에서 중복 제거
        stream2.distinct().forEach(e -> System.out.print( e + " "));

        System.out.println();
        System.out.println();

        // 스트림 변환 : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환 값으로 이루어진 새로운 스트림 생성(????)
        Stream<String> stream3 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream3.map(e -> e.length()).forEach(e -> System.out.print(e + " ")); // 각 string의 길이로 이루어진 스트림 생성

        System.out.println();
        System.out.println();

        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
        Stream<String> stream4 = Arrays.stream(arr);
        stream4.flatMap(s -> Stream.of(s.split(" "))).forEach(System.out::println);

        System.out.println();

        // 스트림 제한
        // limit() : 해당 스트림의 첫 번째 요소부터 전달된 개수 만큼의 요소로만 이루어진 새로운 스트림 반환
        // skip() : 해당 스트림의 첫 번째 요소부터 전달된 개수 만큼의 요소를 제외하고 출력
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);
        IntStream stream7 = IntStream.range(0, 10);
        stream5.limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        stream6.skip(5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        stream7.skip(3).limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

        // 스트림 정렬 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        Stream<String> stream9 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream8.sorted().forEach(e -> System.out.print(e + " "));
        System.out.println();
        stream9.sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
    }
}
