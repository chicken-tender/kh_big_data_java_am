package 스트림예제3_0208;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// 배열로 부터 스트림 만들기
public class Main {
    public static void main(String[] args) {
        String[] arr = {"홍길동", "한석봉", "이순신", "신사임당", "안중근", "강감찬"};
        Stream<String> stream1 = Arrays.stream(arr); // 배열로 부터 스트림을 만듬 (배열 자체는 스트림이 없음)
        stream1.forEach(e -> System.out.print(e + " "));

        System.out.println();

        Stream<String> stream2 = Arrays.stream(arr, 1, 3); // 1부터 3 미만
        stream2.forEach(e -> System.out.print(e + " "));

        System.out.println();

        //숫자 범위로 부터 스트림 만들기
        IntStream stream = IntStream.rangeClosed(1,100);
        int sum = stream.sum();
        System.out.println("합계 : " + sum);
    }
}
